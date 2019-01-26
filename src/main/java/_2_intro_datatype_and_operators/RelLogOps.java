package _2_intro_datatype_and_operators;

// Demonstrate the relational and logical operators.
class RelLogOps {
    public static void main(String[] args) {
        int i, j;
        boolean b1, b2;

        i = 10;
        j = 11;
        if (i < j) System.out.println("i < j");
        if (i <= j) System.out.println("i <= j");
        if (i != j) System.out.println("i != j");
        if (i == j) System.out.println("this won't execute");
        if (i >= j) System.out.println("this won't execute");
        if (i > j) System.out.println("this won't execute");

        b1 = true;
        b2 = false;
        if (b1 & b2) System.out.println("this won't execute");
        if (!(b1 & b2)) System.out.println("!(b1 & b2 is true");
        if (b1 | b2) System.out.println("b1 | b2 is true");
        if (b1 ^ b2) System.out.println("b1 ^ b2 is true");
    }
}

/* ***************************************
 * Run:
 *      i < j
 *      i <= j
 *      i != j
 *      !(b1 & b2 is true
 *      b1 | b2 is true
 *      b1 ^ b2 is true
 *
 * ***************************************
 * Relational and Logical Operators:
 *  Relational to the relationships that values can have with one another, and
 * logical refers to the ways in which true and false values can be connected
 * together.
 *  Relational Operator:
 *      Operator        Meaning
 *      ==          |   Equal to
 *      !=          |   Not equal to
 *      >           |   Greater than
 *      <           |   Less than
 *      >=          |   Greater than or equal to
 *      <=          |   Less than or equal to
 *  Logical Operator:
 *      Operator        Meaning
 *      &           |   AND
 *      |           |   OR
 *      ^           |   XOR (exclusive OR)
 *      ||          |   Short-circuit OR
 *      &&          |   Short-circuit AND
 *      !           |   NOT
 *
 *  The outcome of the relational and logical operators is a 'boolean' value.
 *  For the logical operators, the operands must be of type 'boolean', and the
 * result of a logical operation is of type 'boolean'.
 *      p        q          p & q       p | q        p ^ q        !p
 *      False |  False  |   False   |   False   |    False    |   True
 *      True  |  False  |   False   |   True    |    True     |   False
 *      False |  True   |   False   |   True    |    True     |   True
 *      True  |  True   |   True    |   False   |    False    |   False
 */