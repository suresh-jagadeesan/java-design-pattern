package com.dp.create;

public class BuilderPattern {
    static class Table {
        private String color;
        private int numberOfDrawer;
        private boolean isAdjustable;

        private Table(TableBuilder builder){
            this.color = builder.color;
            this.numberOfDrawer = builder.numberOfDrawer;
            this.isAdjustable = builder.isAdjustable;
        }

        @Override
        public String toString() {
            return "Table{" +
                    "color='" + color + '\'' +
                    ", numberOfDrawer=" + numberOfDrawer +
                    ", isAdjustable=" + isAdjustable +
                    '}';
        }

        public static class TableBuilder {
            private String color;
            private int numberOfDrawer;
            private boolean isAdjustable;

            public TableBuilder(int numberOfDrawer) {
                this.numberOfDrawer = numberOfDrawer;
            }

            public TableBuilder color(String color) {
                this.color = color;
                return this;
            }

            public TableBuilder isAdjustable(boolean flag) {
                this.isAdjustable = flag;
                return this;
            }

            public Table build() {
                return new Table(this);
            }
        }
    }


    public static void main(String args[]) {
        Table tvTable = new Table.TableBuilder(2).color("Brown").isAdjustable(true).build();
        System.out.println(tvTable);
    }
}
