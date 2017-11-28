# metro-cs1-comprehensive
Exam problems in beginning and intermediate Java programming. Part of the comprehensive review and exam for CS 1 course, MSUD, Fall 2017.

## Part I

1. Fork this repository.
2. Clone it and open it as a new project in IntelliJ _from existing sources_.
3. Create a run configuration.
4. Run the code.
5. Answer the questions on Canvas.

## Part II

1. In `main` there is commented out code for new shapes you will have to add.
2. Follow the existing code to create 4 new concrete (not `abstract`) classes:
    * `Parallelogram` is a subclass of `Geometric` with two sides `a` and `b`, and angle `theta` between them, with area A = a * b * sin(theta). Use `Math.sin()`.
    * `Rectangle` is a subclass of `Parallelogram` and has an angle of 90 degrees (or pi/2 radians). Use `Math.PI/2.0`.
    * `Square` is a subclass of `Rectangle` and has equal sides.
    * `Rhombus` is a subclass of `Parallelogram` and has equal sides.
3. Look at the commented out code to see the required constructor for each class. The constructor should call the superclass constructor with `super()` and only then do any subclass-specific initialization, if any.
4. To help you with implementing each new class's `toString`, the output after the code is uncommented should look as follows:
```text
Number of shapes: 30
Elipsoid: x=1.905000 y=3.095000 semiMaj=2.095000 semiMin=0.905000 (Area: 2.5730429231063803)
Elipsoid: x=2.095000 y=2.905000 semiMaj=2.095000 semiMin=0.905000 (Area: 2.5730429231063803)
Elipsoid: x=1.905000 y=2.905000 semiMaj=1.905000 semiMin=1.095000 (Area: 3.7668481314705016)
Elipsoid: x=2.095000 y=2.905000 semiMaj=2.095000 semiMin=1.095000 (Area: 3.7668481314705016)
Elipsoid: x=2.095000 y=2.905000 semiMaj=1.905000 semiMin=0.905000 (Area: 2.5730429231063803)
Cirle: x=-2.905000 y=-1.905000 r=2.905000 (Area: 26.511978943460598)
Cirle: x=-2.905000 y=-1.905000 r=2.905000 (Area: 26.511978943460598)
Cirle: x=-2.905000 y=-1.905000 r=2.905000 (Area: 26.511978943460598)
Cirle: x=-2.905000 y=-2.095000 r=3.095000 (Area: 30.093394568552974)
Cirle: x=-2.905000 y=-2.095000 r=2.905000 (Area: 26.511978943460598)
Parallelogram: x=1.405000 y=1.795000 a=4.295000 b=1.205000 theta=1.037478 (Area: 4.456729329727361)
Parallelogram: x=1.595000 y=1.605000 a=4.105000 b=1.395000 theta=1.037478 (Area: 4.931209036552295)
Parallelogram: x=1.595000 y=1.605000 a=4.105000 b=1.395000 theta=0.847478 (Area: 4.292642424467474)
Parallelogram: x=1.405000 y=1.605000 a=4.105000 b=1.205000 theta=1.037478 (Area: 4.259574830857001)
Parallelogram: x=1.595000 y=1.605000 a=4.295000 b=1.395000 theta=0.847478 (Area: 4.491327457512254)
Rectangle: x=-1.595000 y=-1.605000 a=4.295000 b=1.395000 theta=1.570796 (Area: 5.991525)
Rectangle: x=-1.405000 y=-1.605000 a=4.295000 b=1.395000 theta=1.570796 (Area: 5.991525)
Rectangle: x=-1.595000 y=-1.605000 a=4.105000 b=1.395000 theta=1.570796 (Area: 5.726475000000001)
Rectangle: x=-1.595000 y=-1.795000 a=4.105000 b=1.205000 theta=1.570796 (Area: 4.946525000000001)
Rectangle: x=-1.595000 y=-1.795000 a=4.295000 b=1.205000 theta=1.570796 (Area: 5.1754750000000005)
Square: x=-1.595000 y=-1.795000 side=3.605000 theta=1.570796 (Area: 12.996025)
Square: x=-1.595000 y=-1.795000 side=3.605000 theta=1.570796 (Area: 12.996025)
Square: x=-1.595000 y=-1.605000 side=3.605000 theta=1.570796 (Area: 12.996025)
Square: x=-1.405000 y=-1.795000 side=3.605000 theta=1.570796 (Area: 12.996025)
Square: x=-1.595000 y=-1.605000 side=3.605000 theta=1.570796 (Area: 12.996025)
Rhombus: x=2.595000 y=-1.795000 side=2.895000 theta=1.805000 (Area: 8.15221842526884)
Rhombus: x=2.405000 y=-1.605000 side=2.705000 theta=1.805000 (Area: 7.117266208268408)
Rhombus: x=2.405000 y=-1.605000 side=2.895000 theta=1.805000 (Area: 8.15221842526884)
Rhombus: x=2.595000 y=-1.795000 side=2.705000 theta=1.995000 (Area: 6.668493558389301)
Rhombus: x=2.595000 y=-1.605000 side=2.895000 theta=1.805000 (Area: 8.15221842526884)

Process finished with exit code 0

```
5. The actual numbers don't matter. Feel free to set your own points and lengths around which to jitter.
6. Answer the questions on Canvas.