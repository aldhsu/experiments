file = open('words.txt', 'r')
listofwords = []
for word in file.read().split(','):
    listofwords.append((word.strip('"')).lower())
print(listofwords)    

def create_alphabet():
    alpha_to_int = {}
    for i in range(97, 123):
        alpha_to_int[chr(i)] = i - 96
    return alpha_to_int

def is_triangle(number):
    bool = False
    return bool
    

alpha_to_int = create_alphabet()
listofwordsasnumbers = []
for word in listofwords:
    total = 0
    for letter in word:
        total += alpha_to_int[letter]
    listofwordsasnumbers.append(total)

