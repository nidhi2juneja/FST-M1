fruit_dict = {"apple":250, "banana":100, "kiwi":250, "orange": 50, "grapes": 60, "peach": 30}

value_to_be_checked = input("Which fruits do you want to purchase? ").lower()

if value_to_be_checked in fruit_dict:
    print("Yes,", value_to_be_checked, "is available")
else:
     print("No,", value_to_be_checked, "is not available")