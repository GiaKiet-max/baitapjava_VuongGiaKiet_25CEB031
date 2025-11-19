public class Line {
    private Point5_1 begin;
    private Point5_1 end;

    public Line (Point5_1 begin, Point5_1 end){
        this.begin = begin;
        this.end = end;
    }

    public Line (int x1, int y1, int x2, int y2){
        begin = new Point5_1(x1, y1);
        end = new Point5_1(x2, y2);
    }

    public String toString(){
        return "Line: [begin=" + begin.toString() + ", end=" + end.toString() + "]";
    }

    public Point5_1 getBegin(){
        return begin;
    }

    public Point5_1 getEnd(){
        return end;
    }

    public void setBegin(Point5_1 begin){
        this.begin = begin;
    }

    public void setEnd(Point5_1 end){
        this.end = end;
    }

    public int getBeginX(){
        return begin.getX();
    }

    public int getBeginY(){
        return begin.getY();
    }

    public int getEndX(){
        return end.getX();
    }

    public int getEndY(){
        return end.getY();
    }

    public void setBeginX(int x){
        begin.setX(x);
    }

    public void setBeginY(int y){
        begin.setY(y);
    }

    public void setBeginXY(int x, int y){
        begin.setXY(x,y);
    }

    public void setEndX(int x){
        end.setX(x);
    }

    public void setEndY(int y){
        end.setY(y);
    }

    public void setEndXY(int x, int y){
        end.setXY(x,y);
    }

    public int getLength(){
        int xDiff = end.getX() - begin.getX();
        int yDiff = end.getY() - begin.getY();
        return (int) Math.sqrt(xDiff*xDiff + yDiff*yDiff);
    }


}
