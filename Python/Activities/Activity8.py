number_list = list(input("Enter a list of comma seperated values: ").split(','))
print(number_list)

if number_list[0] == number_list[-1]:
    print(True)
else:
    print(False)