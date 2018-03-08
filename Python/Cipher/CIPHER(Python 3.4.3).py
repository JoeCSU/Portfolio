import random
from tkinter import *
from tkinter import filedialog
from pip._vendor.distlib.compat import raw_input

alphabet = []

for number in range(97,122):
    alphabet.append(chr(number))

key =[121, 99, 102, 101, 115, 116, 98, 119, 117, 114, 112, 111, 120, 100, 103, 113, 107, 122, 104, 106, 109, 108, 110, 118, 105, 97]
outfile=open(file="key.txt", mode="w")
for item in (key):
    outfile.write(chr(item))
    
print("press enter to choose the cleartext file to encrypt...")
print()
print()
raw_input()
clearText = filedialog.askopenfile(mode="rb")

file = clearText.read()

outfile = open(file="ciphertext", mode="w")


for letter in (file):
    if chr(letter) in (alphabet):
        keyIndex = alphabet.index(chr(letter))
        outfile.write((chr(key[keyIndex])))
    else:
        outfile.write(chr(letter))
outfile.close()
print ("File encryption successful, press enter to exit...")
raw_input()