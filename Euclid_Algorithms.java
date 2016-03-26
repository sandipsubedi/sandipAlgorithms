    int gcd(a, b) {
        while (b != 0) {
            t = b;
            b = a % b; \\ a mod b
            a = t;
        }
        return a;
    }

  //   Recursive version  

    int gcd(a, b) {
        if (b = 0) 
            return a
        else
            return gcd(b, a mod b)
    }