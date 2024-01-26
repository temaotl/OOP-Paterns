package org.example.pattern;


// Builder Pattern
public  class NutrionFacts {
    private final int servingSize;
    private final int servings;
    private final int calories;
    private final int fat;
    private final int sodium;
    private final int carbohydrate;
    public static class Builder
    {
        private final int servingSize;
        private final int servings;

        // not necessary  field
        private  int calories=0;
        private  int fat=0;
        private  int sodium=0;
        private  int carbohydrate=0;

        public  Builder(int servingSize, int servings) {
            this.servingSize = servingSize;
            this.servings = servings;
        }
        public Builder calories (int val)
        {
            calories = val;
            return this;
        }

        public Builder fat (int val)
        {
            fat = val;
            return this;
        }
        public Builder sodium (int val)
        {
            sodium = val;
            return this;
        }

        public Builder carbohydrate (int val)
        {
            carbohydrate = val;
            return this;
        }
        public  NutrionFacts build()
        {
            return  new NutrionFacts(this);
        }

    }
    public NutrionFacts(Builder builder) {
        this.servingSize = builder.servingSize;
        this.servings = builder.servings;
        this.calories = builder.calories;
        this.fat = builder.fat;
        this.sodium = builder.sodium;
        this.carbohydrate = builder.carbohydrate;
    }

}



