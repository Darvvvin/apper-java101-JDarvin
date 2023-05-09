package flight;

public class Flight {
    int seats;
    int passengers;
    int originalSeats;

    Flight() { // Set directly, initial value upon creation
        seats = 10;
        passengers = 0;

        originalSeats = seats;
    }

    //TODO: Validate if there are available seats left. If now display "Full"
    public void addPassenger() {
        if (seats > 0) {
            passengers++;
            seats--;
        } else
            System.out.println("Full");
    }

    //TODO: Set new value of seat so addPassenger is allowed again
    public void setNumberOfSeats(int seats) {
        // WRONG, Parameter is referring to local var
        // seats = seats;

        // 'this' refers to instance variable within class
        this.seats = (seats - originalSeats);
    }
}
