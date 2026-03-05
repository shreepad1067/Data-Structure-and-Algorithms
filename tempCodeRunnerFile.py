number=4421
str=str(number)
sum=0
pro=1
num=0
for i in range(0,len(str)):
   num=int(str[i])
   sum=sum+num
   pro=pro*num
   
print(sum)
print(pro)
print(f"The Difference of the sum and product of the numbers is: {pro - sum}")