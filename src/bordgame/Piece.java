package bordgame;

public  class Piece {
    protected Position position;
    private Bord bord;

    public Piece(Bord bord) {
        this.bord = bord;
    }

    protected Bord getBord() {
        return bord;
    }



}


