package ca.durhamcollege;

public class Line
{
    // Private Instance Variables
    private Vector2D start;
    private Vector2D end;

    // Public Properties

    public Vector2D getStart()
    {
        return start;
    }

    public void setStart(Vector2D start)
    {
        this.start = start;
    }

    public Vector2D getEnd()
    {
        return end;
    }

    public void setEnd(Vector2D end)
    {
        this.end = end;
    }

    public void set(Vector2D start, Vector2D end)
    {
        setStart(start);
        setEnd(end);
    }

    public float getLength()
    {
        return Vector2D.distance(getStart(), getEnd());
    }


    // Constructors

    public Line()
    {
        set(Vector2D.zero(), Vector2D.zero());
    }

    public Line(Vector2D start, Vector2D end)
    {
        set(start, end);
    }

    // Private Methods

    // Public Methods
    @Override
    public String toString()
    {
        return "start: " + getStart().toString() + " end: " + getEnd().toString() + " length: " + getLength();
    }
}
