import java.util.Scanner;

public enum DAYS  {
    MONDAY("ДУЙШОМБУ"){

    },
    TUESDAY("БЕЙШЕМБИ"){

    },

    WEDNESDAY("ШАРШЕМБИ"){

    },
    THUESDAY("ШЕЙШЕМБИ"){

    },
    FRIDAY("ЖУМА"){

    },
    SATURDAY("ИШЕМБИ ДЖАВА"){

    },
    SUNDAY("ЖЕКШЕМЕМБИ"){

    };

    private String name;
    DAYS() {
    }

    DAYS(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

