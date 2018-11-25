package model.unit;

public class UnitFighter {

    protected int hitPoint;
    protected int damage;
    protected int armour;
    protected int munition;
    protected float accuracy;
    protected int nearHit;
    protected float accuracyNear;
     

   



	public UnitFighter() {
    }

    public int getHitPoint() {
        return hitPoint;
    }

    public void setHitPoint(int hitPoint) {
        this.hitPoint = hitPoint;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getArmour() {
        return armour;
    }

    public void setArmour(int armour) {
        this.armour = armour;
    }
	public int getMunition() {
		return munition;
	}

	public void setMunition(int munition) {
		this.munition = munition;
	}

	public float getAccuracy() {
		return accuracy;
	}

	public void setAccuracy(float accuracy) {
		this.accuracy = accuracy;
	}

	public int getNearHit() {
		return nearHit;
	}

	public void setNearHit(int nearHit) {
		this.nearHit = nearHit;
	}

	public float getAccuracyNear() {
		return accuracyNear;
	}

	public void setAccuracyNear(float accuracyNear) {
		this.accuracyNear = accuracyNear;
	}

	
    
}
