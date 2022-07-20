player1 = input("Enter player1 name: ")
player2 = input("Enter player2 name: ")

while(True):
    player1_choice = input(player1 + " ,what do you want to pick rock, paper or scissors? ").lower()
    player2_choice = input(player2 + " ,what do you want to pick rock, paper or scissors? ").lower()

    if player1_choice == player2_choice:
        print("There is a tie between 2 players, please give a try again")
    elif player1_choice == 'rock':
        if player2_choice == 'scissors':
            print("Rock Wins!")
        else:
            print("Paper wins!")
    elif player1_choice == 'scissors':
        if player2_choice == 'paper':
            print("Scissors win!")
        else:
            print("Rock wins!")
    elif player1_choice == 'paper':
        if player2_choice == 'rock':
            print("Paper wins!")
        else:
            print("Scissors win!")
    else:
        print("Invalid input! Please enter either of these 3 rock, paper or scissors")

    anotherRound = input("Do you want to play another round? Yes/No? ").lower()
    if (anotherRound == 'yes'):
        pass
    elif (anotherRound == 'no'):
        raise SystemExit
    else:
        print("You entered an invalid option. Existing now.")
        raise SystemExit


