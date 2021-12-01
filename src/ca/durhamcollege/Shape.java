package ca.durhamcollege;

import java.util.ArrayList;

public abstract class Shape
{
    // Private Instance Variables
    private ArrayList<Vector2D> vertices;
    private ArrayList<Line> edges;

    // Public Properties
    public void setVertices(Vector2D[] vertices)
    {
        build(vertices);
    }

    public void setVertex(Vector2D vertex)
    {
        Vector2D[] vertices = {vertex};
        build(vertices);
    }

    // Constructors

    /**
     * Default Constructor
     */
    public Shape()
    {
        initialize();
        vertices.add(Vector2D.zero());
        edges.add(new Line());
    }

    /**
     * Parameterized Constructor
     */
    public Shape(Vector2D[] vertices)
    {
        initialize();
        setVertices(vertices);
    }


    // Private Methods

    /**
     * Initializes two empty array lists for the shape class
     */
    private void initialize()
    {
        vertices = new ArrayList<Vector2D>();
        edges = new ArrayList<Line>();
    }

    private void build(Vector2D[] vertices)
    {
        // Clear before we build
        this.vertices.clear();
        this.edges.clear();

        // Add all vertices to the shape
        for (int i = 0; i < vertices.length; i++)
        {
            this.vertices.add(vertices[i]);
        }

        // Build Edges
        for (int i = 0; i < this.vertices.size(); i++)
        {
            if (i < this.vertices.size() - 1)
            {
                this.edges.add(new Line(this.vertices.get(i), this.vertices.get(i + 1)));
            }
            else
            {
                this.edges.add(new Line(this.vertices.get(i), this.vertices.get(0)));
            }
        }
    }

    // Public Methods
    @Override
    public String toString()
    {
        String output = "";

        output += "---------------------------------\n";
        output += "Vertices: \n";
        output += "---------------------------------\n";

        for (var vertex : vertices)
        {
            output += vertex.toString() + "\n";
        }

        output += "\n---------------------------------\n";
        output += "Edges: \n";
        output += "---------------------------------\n";

        for (var edge : edges)
        {
            output += edge.toString() + "\n";
        }

        return output;
    }


}
