public class LineSub extends Point5_1{
    Point5_1 end;

    //Constructors
    public LineSub(int beginX, int beginY, int endX, int endY){
        super(beginX, beginY);
        this.end = new Point5_1(endX, endY);
        this.end = end;
    }

    public String toString(){
        return "Line: [begin= (" + getX() + "," + getY() + "), end= " + end.toString() + "]";
    }

    public Point getBegin(){
        return new Point(getX(), getY());
    }

    public Point getEnd(){
        return new Point(end.getX(), end.getY());
    }

    public void setBegin(int x, int y){
        setX(x);
        setY(y);
    }

    public void setEnd(int x, int y){
        end.setX(x);
        end.setY(y);
    }

    public int getBeginX(){
        return getX();
    }

    public int getBeginY(){
        return getY();
    }

    public int getEndX() {
        return end.getX();
    }

    public int getEndY() {
        return end.getY();
    }

    public void setBeginX(int x){
        setX(x);
    }

    public void setBeginY(int y){
        setY(y);
    }

    public void setBeginXY(int x, int y){
        setX(x);
        setY(y);
    }

    public void setEndX(int x){
        end.setX(x);
    }

    public void setEndY(int y){
        end.setY(y);
    }

    public void setEndXY(int x, int y){
        end.setX(x);
        end.setY(y);
    }

    public int getLength(){
        int xDiff = end.getX() - getX();
        int yDiff = end.getY() - getY();
        return (int) Math.sqrt(xDiff * xDiff + yDiff * yDiff);
    }

    public float getGradient(){
        int xDiff = end.getX() - getX();
        int yDiff = end.getY() - getY();
        return (float) Math.atan2(yDiff, xDiff);
    }

}
