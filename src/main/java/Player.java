public class Player {
    private String name;
    private int endurance;
    private int sprint;
    private int dribble;
    private int passing;
    private int shooting;
    private int overallSkill;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (!name.trim().isEmpty()) {
            if (!name.equals("null")){
                this.name = name;
            }else {
                System.out.println("A name should not be empty.");
            }
        }
    }

    public int getEndurance() {
        return endurance;
    }

    public void setEndurance(int endurance) {
        if (endurance >= 0) {
            if (endurance <= 100) {
                this.endurance = endurance;
            } else {
                System.out.println("Endurance should be between 0 and 100.");
            }
        }
    }

    public int getSprint() {
        return sprint;
    }

    public void setSprint(int sprint) {
        if (sprint >= 0) {
            if (sprint <= 100) {
                this.sprint = sprint;
            } else {
                System.out.println("Sprint should be between 0 and 100.");
            }
        }
    }

    public int getDribble() {
        return dribble;
    }

    public void setDribble(int dribble) {
        if (dribble >= 0) {
            if (dribble <= 100) {
                this.dribble = dribble;
            } else {
                System.out.println("Dribble should be between 0 and 100.");
            }
        }
    }

    public int getPassing() {
        return passing;
    }

    public void setPassing(int passing) {
        if (passing >= 0) {
            if (passing <= 100) {
                this.passing = passing;
            } else {
                System.out.println("Passing should be between 0 and 100.");
            }
        }
    }

    public int getShooting() {
        return shooting;
    }

    public void setShooting(int shooting) {
        if (shooting >= 0) {
            if (shooting <= 100) {
                this.sprint = shooting;
            } else {
                System.out.println("Shooting should be between 0 and 100.");
            }
        }
    }
}
