from pydobot import Dobot
import time

# Change this to your Dobot port,
port = "/dev/tty.usbserial-1140"

# Connect to robot,
device = Dobot(port=port)

print("Connected to Dobot")


# -----------------------------
# Helper functions
# -----------------------------
def suction_on():
    device.suck(True)

def suction_off():
    device.suck(False)


# -----------------------------
# Define coordinates
# -----------------------------
# Safe start position
HOME =(220, -90, 60, 0)


# Object pickup position
PICK =[
    (300, -90, 22, 0),
    (300, -60, 22, 0),
    (300, -30, 22, 0),
    (300, 0, 22, 0),
    (300, 30 , 22, 0),
    (300, 60, 22, 0),
]

# Object placement position
PLACE = [
    (250, 90, 5, 0),
    (255, 51, 5, 0),
    (260, 10, 5, 0),
    (247, 70, 40, 0),
    (247, 30, 38, 0),
    (247, 51, 75, 0),
]

# Move to home spot to start the mission.
device.move_to(HOME, wait=True)


for i, num in enumerate(PICK):
    print(f"Starting placement {i}...")

    # Move above pickup point
    device.move_to(PICK[i][0], PICK[i][1], 80, PICK[i][3], wait=True)
    # Move down to object
    device.move_to(PICK[i], wait=True)
    # Pick object
    suction_on()
    time.sleep(1)
    # Lift object
    device.move_to(PICK[i][0], PICK[i][1], 80, PICK[i][3], wait=True)
    # Move above placement point
    device.move_to(PLACE[i][0], PLACE[i][1], 100, PLACE[i][3], wait=True)
    # Move down to placement point
    device.move_to(PLACE[i], wait=True)
    # Suction off
    suction_off()
    time.sleep(1)

# Move back up
device.move_to(PLACE[i][0], PLACE[i][1], 100, PLACE[i][3], wait=True)

# Return to home placement
device.move_to(HOME, wait=True)

# Close connection
print("All placements finished!")
device.close()