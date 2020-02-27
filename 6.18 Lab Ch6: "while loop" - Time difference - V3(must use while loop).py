while True:
    first_time = input("Enter the first time as hours:minutes in 24 hour format:\n ").split(":")
    second_time = input("Enter the second time as hours:minutes in 24 hour format:\n ").split(":")

    if len(first_time) != 2 or len(second_time) != 2:
        print("Invalid format !!!")
        continue

    else:
        if (not first_time[0].isdigit()) or (not first_time[1].isdigit()) or (not second_time[0].isdigit) or (not second_time[1].isdigit()):
            print("Invalid entry - input should be numbers only.")
            continue

        else:
            if int(first_time[0]) >= 24 or int(first_time[1]) > 60 or int(second_time[0]) >= 24 or int(second_time[1]) > 60:
                print("Invalid time range.")
                continue
            else:
                if int(first_time[0]) < int(second_time[0]):
                    print("time1 comes first")
                elif int(first_time[0]) == int(second_time[0]):
                    if int(first_time[1]) < int(second_time[1]):
                        print("time1 comes first")
                    elif int(first_time[1]) == int(second_time[1]):
                        print("time1 and time2 are the same")
                else:
                    print("time2 comes first")
    again = input("Would you like to try again, 'Yes' for continue, quit otherwise:\n ").lower()
    if again != "yes":
        print("Goodbye")
        break
