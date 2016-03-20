import sys, random

upperBound = int(sys.argv[1]) if len(sys.argv) > 1 else 100
numberToGuess = random.randint(1, upperBound)
guess = -1
numberOfGuesses = 0
prompt = "\nI've chosen a number between 1 and %s. See if you can guess it:\n" % upperBound

while guess != numberToGuess:
    guess = int(raw_input(prompt))
    numberOfGuesses += 1
    prompt = "Nope! Go higher...\n" if guess < numberToGuess else "Nope! Go lower...\n"

print("Well done! The number was indeed %s. You took %s guesses." % (numberToGuess, numberOfGuesses))
