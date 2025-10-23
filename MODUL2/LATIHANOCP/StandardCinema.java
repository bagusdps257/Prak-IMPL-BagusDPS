class StandardCinema extends Cinema {
    public StandardCinema(Double price) {
        this.price = price;
    }

    @Override
    Double calculateAdminFee() {
        return price * 10 / 100;
    }
}

/*
class StandardCinema extends Cinema {
    public StandardCinema(double price) {
        this.price = price;
    }
}
*/