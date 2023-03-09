package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX_VALUE = 50;
    private static final int DEFAULT_RADIUS = 10;
    private static final String DEFAULT_COLOR = "white";

    private Random random = new Random();

    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        Figure figure;
        switch (randomFigures()) {
            case CIRCLE:
                figure = new Circle(colorSupplier.getRandomColor(), random.nextInt(MAX_VALUE));
                break;
            case SQUARE:
                figure = new Square(colorSupplier.getRandomColor(), random.nextInt(MAX_VALUE));
                break;
            case RECTANGLE:
                figure = new Rectangle(colorSupplier.getRandomColor(), random.nextInt(MAX_VALUE),
                        random.nextInt(MAX_VALUE));
                break;
            case RIGHT_TRIANGLE:
                figure = new RightTriangle(colorSupplier.getRandomColor(),
                        random.nextInt(MAX_VALUE), random.nextInt(MAX_VALUE));
                break;
            default:
                figure = new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                        random.nextInt(MAX_VALUE), random.nextInt(MAX_VALUE),
                        random.nextInt(MAX_VALUE));
                break;
        }
        return figure;
    }

    private Figures randomFigures() {
        int index = random.nextInt(Figures.values().length);
        return Figures.values()[index];
    }

    public Figure getDefaultFigure() {
        Figure whiteCircle;

        return whiteCircle = new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);
    }

}
