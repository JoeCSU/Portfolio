from pip._vendor.distlib.compat import raw_input

    

# calculates pressure in atm, bar, and kPa
    
def torr_Convert():
    
    torr = input("Enter the pressure in Torr: ")

    x = float(torr) / 760            # atm
 
    y = float(x) * 1.01325           # bar

    z = float(x) * 101.325           # kPa 

    print()
    print(str(x) + " atm")
    print()
    print(str(y) + " bar")
    print()
    print(str(z) + " kPa")
    print()
    print("Press enter to exit...")
    raw_input()

# calculates pressure in torr, bar, and kPa
    
def atm_Convert():
    
    atm = input("Enter the pressure in atm: ")

    x = float(atm) * 760          # torr
 
    y = float(atm) * 1.01325      # bar

    z = float(atm) * 101.325      # kPa 

    print()
    print(str(x) + " torr")
    print()
    print(str(y) + " bar")
    print()
    print(str(z) + " kPa")
    
def bar_Convert():
    
    bar = input("Enter the pressure in bar: ")

    x = float(bar) / 1.01325                         # atm
 
    y = (float(bar) / 1.01325) * 760                 # torr

    z = (float(bar) / 1.01325) * 101.325             # kPa 

    print()
    print(str(x) + " torr")
    print()
    print(str(y) + " bar")
    print()
    print(str(z) + " kPa")

def main():
    atm_Convert()
    print()
    bar_Convert()
    print()
    torr_Convert()

main()