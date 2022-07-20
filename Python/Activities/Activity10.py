number_tuple = tuple(input("Enter some values with comma seperated: ").split(','))
print(number_tuple)

print('Elements those are divisible by 5 are: ')
for num in number_tuple:
    if(int(num) % 5 == 0):
        print(num)