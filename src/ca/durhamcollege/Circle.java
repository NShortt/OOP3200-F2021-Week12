package ca.durhamcollege;

public class Circle extends Shape
{
    // Private Instance Members
    private Vector2D center;
    private float radius;


    // Public Properties

    public Vector2D getCenter()
    {
        return center;
    }

    public void setCenter(Vector2D center)
    {
        super.setVertex(center);
        this.center = center;
    }

    public float getRadius()
    {
        return radius;
    }

    public void setRadius(float radius)
    {
        this.radius = radius;
    }

    public void set(Vector2D center, float radius)
    {
        setCenter(center);
        setRadius(radius);
    }

    public float getCircumference ()
    {
        return (float) (Math.PI * radius * 2);
    }

    public float getArea()
    {
        return (float) (Math.PI * Math.pow(radius, 2));
    }

    // Constructors
    public Circle(Vector2D center, float radius)
    {
        super();
        set(center, radius);
    }
    // Private Methods

    // Public Methods
    @Override
    public String toString()
    {
        String output = "";

        output += "---------------------------------\n";
        output += "Center       : " + getCenter() + "\n";
        output += "Radius       : " + getRadius() + "\n";
        output += "Area         : " + getArea() + "\n";
        output += "Circumference: " + getCircumference() + "\n";
        output += "---------------------------------\n";

        return output;
    }
}
