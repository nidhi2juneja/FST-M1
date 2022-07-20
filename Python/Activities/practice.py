# should_i_exit = True
# if should_i_exit == True:
#     print("Hello")
#     raise SystemExit
#     print("Jello")

# import pandas
import pandas as pd
# from pandas import ExcelFile
from pandas import ExcelWriter

data = {
    "Vehicle Type": ["Car", "Car", "Bike"],
    "Manufacturer": ["Maruti", "Toyota", "Royal Enfield"],
    "Model": ["Swift", "Corolla", "Thunderbird"]
}

dataframe = pd.DataFrame(data)
writer = ExcelWriter("Vehicles.xlsx")
dataframe.to_excel(writer, "Sheet 1", index=False)
writer.save()

# dataframe = pd.read_excel("employees.xlsx", sheet_name="Sheet1")
# print(dataframe["Name"][2])
# data = {
#     "Vehicle Type": ["Car", "Car", "Bike"],
#     "Manufacturer": ["Maruti", "Toyota", "Royal Enfield"],
#     "Model": ["Swift", "Corolla", "Thunderbird"]
# }
# dataframe = pd.DataFrame(data)
# dataframe.to_csv("vehicles.csv")

# dataframe = pd.read_csv('employees.csv')
# print(dataframe["Name"][2])

# # Create a dictionary to hold our data
# data = {
#   "X": [1, 2, 3, 4, 5],
#   "Y": [9, 8, 7, 6, 5],
#   "Z": [10, 12, 8, 4, 3]
# }

# # Create a new DataFrame using our dictionary
# table = pd.DataFrame(data)

# # Print the DataFrame
# print(table)