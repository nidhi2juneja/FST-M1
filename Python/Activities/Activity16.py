class Car:
    'Car Class representation'

    def __init__(self, manufacturer, model, make, transmission, color):
        self.manufacturer = manufacturer
        self.model = model
        self.make = make
        self.transmission = transmission
        self.color = color

    def accelerate(self):
        print(self.manufacturer + " " + self.model + " is moving")

    def stop(self):
        print(self.manufacturer + " "  + self.model + " has stopped")

c1 = Car("Suzuki", "Alto", "2019", "Automatic", "Red")
c2 = Car("Suzuki", "Ciaz", "2013", "Manual", "Black")
c3 = Car("BMW", "X3", "2015", "Automatic", " White")
c1.accelerate()
c1.stop()

c2.accelerate()
c2.stop()

c3.accelerate()
c3.stop()