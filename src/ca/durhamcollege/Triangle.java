package ca.durhamcollege;

public class Triangle extends Shape
{
    // Constructors

    /**
     * Constructs a Triangle with three points (p1, p2, and p3)
     * @param p1 point 1
     * @param p2 point 2
     * @param p3 point 3
     */
    public Triangle(Vector2D p1, Vector2D p2, Vector2D p3) throws Exception
    {
        super();
        setVertices(p1, p2, p3);
    }

    /**
     * Constructs a Triangle from a Vector2D array of points.
     * Vector2D must have a minimum size of 3 is required for this constructor to be used
     * @param vertices Vector2D array to be passed to the constructor
     * @throws Exception throws exception if the size of Vector2D array is less than 3
     */
    public Triangle(Vector2D[] vertices) throws Exception
    {
        super();
        if (vertices.length >= 3)
        {
            setVertices(vertices[0], vertices[1], vertices[2]);
        }
        else
        {
            throw new Exception("ERROR: Triangle constructed with less than 3 vertices.");
        }
    }

    // Public Properties

    /**
     * Sets the values of the vertices of the Triangle.
     * If values already exists, it overrides them.
     * @param p1 point 1
     *      * @param p2 point 2
     *      * @param p3 point 3
     */
    public void setVertices(Vector2D p1, Vector2D p2, Vector2D p3) throws Exception
    {
        Vector2D[] vertices = {p1, p2, p3};

        // Check if any of the vectors are the same
        if (p1.equals(p2) || p1.equals(p3) || p2.equals(p3))
        {
            throw new Exception("ERROR: Triangle constructed with at least one vertex the same as another.");
        } else {
            super.setVertices(vertices);
        }
    }
}
