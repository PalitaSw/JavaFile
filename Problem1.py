import random

def get_char(char_list, number):
	temp_list =[]
	for i in range(number):
		temp_list.append(random.choice(char_list))
	return  temp_list

while True:
	num_char = int(input("What's the minimum lenght?"))
	num_symbol = int(input("How many special character?"))
	num_digits = int(input("How many numbers?"))
	if num_char < num_symbol + num_digits:
		print("The character numbers don't match.")
	else:
		break

lower_list = [chr(i) for i in range(97, 97+25)]
lower_char = get_char(lower_list, num_char)
digit_list = [str(i) for i in range(0, 10)]
digit_char = get_char(digit_list,num_digits)
symbol_list = [chr(i) for i in range(32, 48)]
symbol_char = get_char(symbol_list, num_symbol)


password = lower_char + digit_char + symbol_char
random.shuffle(password)
password = "".join(password)
print(password)


