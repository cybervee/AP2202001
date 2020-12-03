package com.exercicio3;

public abstract class Quadrilateral {
    private Point p1;
    private Point p2;
    private Point p3;
    private Point p4;

    public Quadrilateral(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4) {
        p1 = new Point( x1, y1 );
        p2 = new Point( x2, y2 );
        p3 = new Point( x3, y3 );
        p4 = new Point( x4, y4 );
    }

    public Point getP1() {
        return p1;
    }

    public void setP1(Point p1) {
        this.p1 = p1;
    }

    public Point getP2() {
        return p2;
    }

    public void setPonto2(Point p2) {
        this.p2 = p2;
    }

    public Point getP3() {
        return p3;
    }

    public void setP3(Point p3) {
        this.p3 = p3;
    }

    public Point getP4() {
        return p4;
    }

    public void setP4(Point p4) {
        this.p4 = p4;
    }

    public double getLargura(){
        if(getP1().getY() == getP2().getY()){
            return Math.abs( getP1().getX() - getP2().getX() );
        }
        else{
            return Math.abs( getP2().getX() - getP3().getX() );
        }
    }

    public double getAltura() {
        if(getP1().getY() == getP2().getY()){
            return Math.abs(getP2().getY() - getP3().getY());
        }
        else{
            return Math.abs(getP1().getY()- getP2().getY());
        }
    }

    public double getArea(){
        return somaLados() * getAltura() / 2;
    }

    public double somaLados(){
        if(getP1().getY() == getP2().getY()){
            return Math.abs(getP3().getX()-getP2().getX() + Math.abs(getP3().getX() - getP4().getX()));
        }
        else{
            return Math.abs((getP2().getX() - getP3().getX()) + Math.abs( getP4().getX() - getP1().getX()));
        }
    }

    public void imprimeCoordenadas(){
        System.out.printf("%s, %s, %s, %s", p1, p2, p3, p4);
    }

    public abstract void imprime();
}