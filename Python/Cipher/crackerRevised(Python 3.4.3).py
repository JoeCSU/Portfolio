import random
from tkinter import *
from tkinter import filedialog
from pip._vendor.distlib.compat import raw_input

alphabet = []
for number in range(0,128):
    alphabet.append(chr(number))
 
mostCommon = ["e","t","a","o","i","n","s","r","h","d","l","u","c","m","f","y","w","g","p","b","v","k","x","q","j","z"]

frequencies = []

for number in range(0,128):
    alphabet.append(chr(number))

for letter in alphabet:
    frequencies.append(0) 
   
cipherText = filedialog.askopenfile(mode="rb")

file = cipherText.read()
s = 0
for letter in (file):                       #counts the occurrences of each letter in the cipher text and records them
        if chr(letter) in (mostCommon):
            x = frequencies[letter]
            x += 1
            frequencies[letter] = x
counts =[]
for i in range(97,123):
    counts.append(frequencies[i])
#print(sorted(counts, reverse=True))
letters = []
print(mostCommon)
while max(frequencies) != 0:
    x = max(frequencies)
    letters.append(chr(frequencies.index(x)))
    y = frequencies.index(x)
    frequencies[y] = 0
print(letters)
outfile = open(file="cracked.txt", mode="w")
for letter in (file):
    if chr(letter) in (mostCommon):
        x = letters.index(chr(letter))
        y = mostCommon[x]
        outfile.write(y)
    else:
        outfile.write(chr(letter))
outfile.close()
cipherText.close()
infile = open(file="cracked.txt", mode="rb")
file = infile.read()
first = ""
for letter in (file):
    first = first + chr(letter)

first = first.split()
word=""
newLetter=""
the = ["t","h","e"]
for item in (first):
    if len(item) == 3:
        if (item[0]== "t" and (item[1] == "h" or item[2] == "e")) or (item[1] == "h" and (item[0] == "t" or item[2] == "e")) or (item[2] == "e" and (item[0] == "t" or item[1] == "h")):
            word=item
for letter in (word):
    if letter not in (the):
        newLetter = the[word.index(letter)]
        oldLetter = letter
infile.close()
outfile = open(file="cracked1.txt", mode="w")
for letter in file:
    if chr(letter) == oldLetter:
        outfile.write(newLetter)

    else:
        outfile.write(chr(letter))
outfile.close()  
mostCommon[mostCommon.index(oldLetter)] = newLetter
print(oldLetter)
print(newLetter)
print(mostCommon)
print(letters)

infile = open(file="cracked1.txt", mode="rb")
file = infile.read()
first = ""
for letter in (file):
    first = first + chr(letter)

first = first.split()
word=""
newLetter=""
new = ["o","n"]
for item in (first):
    if len(item) == 2:
        if (item[0]== "o" and item[1] not in "f,n,r"):
            word=item

for letter in (word):
    if letter not in (new):
        newLetter = new[word.index(letter)]
        oldLetter = letter
infile.close()
mostCommon[mostCommon.index(oldLetter)] = newLetter        
print(oldLetter)
print(newLetter)
print(mostCommon)
print(letters)



infile = open(file="cracked1.txt", mode="rb")
file = infile.read()
first = ""
for letter in (file):
    first = first + chr(letter)

first = first.split()
word=""
newLetter=""
new = ["i","t"]
for item in (first):
    if len(item) == 2:
        if (item[0] not in ("I", "i") and item[1] == "t"):
            word=item

for letter in (word):
    if letter not in (new):
        newLetter = new[word.index(letter)]
        oldLetter = letter
infile.close()
mostCommon[mostCommon.index(oldLetter)] = newLetter
print(oldLetter)
print(newLetter)
print(mostCommon)
print(letters)

newText = filedialog.askopenfile(mode="rb")
file=newText.read()


outfile = open(file="cracked2.txt", mode="w")
for letter in (file):
    if chr(letter) in (letters):
        x = letters.index(chr(letter))
        y = mostCommon[x]
        outfile.write(y)

    else:
        outfile.write(chr(letter))
outfile.close()
        

infile = open(file="cracked2.txt", mode="rb")
file = infile.read()
first = ""
for letter in (file):
    first = first + chr(letter)

first = first.split()
word=""
newLetter=""
new = ["i","s"]
for item in (first):
    if len(item) == 2:
        if (item[0] in ("I", "i") and item[1] not in ("s","t","n")):
            word=item

for letter in (word):
    if letter not in (new):
        newLetter = new[word.index(letter)]
        oldLetter = letter
infile.close()
mostCommon[mostCommon.index(oldLetter)] = newLetter
print(oldLetter)
print(newLetter)
print(mostCommon)
print(letters)


newText1 = filedialog.askopenfile(mode="rb")
file=newText1.read()


outfile = open(file="cracked2.txt", mode="w")
for letter in (file):
    if chr(letter) in (mostCommon) or chr(letter) in (letters) :
        x = letters.index(chr(letter))
        y = mostCommon[x]

        outfile.write(y)

    else:
        outfile.write(chr(letter))
outfile.close()

infile = open(file="cracked2.txt", mode="rb")
file = infile.read()
first = ""
for letter in (file):
    first = first + chr(letter)

first = first.split()
word=""
newLetter=""
new = ["f","o", "r"]
for item in (first):
    if len(item) == 3:
        if (item[0] == ("f") and item[1] == ("o") and item[2] != "r" ):
            word=item

for letter in (word):
    if letter not in (new):
        newLetter = new[word.index(letter)]
        oldLetter = letter
infile.close()
mostCommon[mostCommon.index(oldLetter)] = newLetter
print(oldLetter)
print(newLetter)
print(mostCommon)
print(letters)

newText1 = filedialog.askopenfile(mode="rb")
file=newText1.read()


outfile = open(file="cracked2.txt", mode="w")
for letter in (file):
    if chr(letter) in (mostCommon) or chr(letter) in (letters) :
        x = letters.index(chr(letter))
        y = mostCommon[x]
        outfile.write(y)

    else:
        outfile.write(chr(letter))
outfile.close()