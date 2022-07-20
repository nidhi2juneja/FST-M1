from datetime import date

name = input("Enter your name: ")
age = int(input("Enter your age: "))
years_100 = str(date.today().year + (100-age))
print(name + ", will be 100 years old in " + years_100)