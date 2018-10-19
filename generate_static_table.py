import random
import json
options = ["temperature", "pressure", "light", "humidity"]
sensors_number = 100 
res = {}
for i in range(0, sensors_number):
    print(i, random.choice(options), sep=",")
