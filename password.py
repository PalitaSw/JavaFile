import random

char_list = ["a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t,u,v,w,x,y,z"]
num_list = ["0,1,2,3,4,5,6,7,8,9"]
symbol_list = ["!,@,$,%,*,&,(,)"]

password_len = int(input("What's the minimum lenght?"))
password_sym = int(input("How many special character?"))
password_num = int(input("How many numbers?"))

for i in range(0, password_len):
    
     password_char = random.choice(char_list)+random.choice(num_list)+random.choice(symbol_list)
     password = password_char
     print ("Your password is: ",password)