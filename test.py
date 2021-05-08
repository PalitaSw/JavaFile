import random
import string

chars = "abcdefghijklmnopqrstuvwxyz!@$%&*"
num = "12345678"

while 1:
    password_len = int(input("What's the minimum lenght?"))
    password_count1 = int(input("How many special character?"))
    password_count2 = int(input("How many numbers?"))
    
    for x in range(0,password_count1,):
        password = " "
        for x in range (0,password_len):
            password_char = random.choice(chars)+random.choice(num)
            password = password_char
            print("Your password is ", password)