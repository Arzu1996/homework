package homework.hw11.DAO;

import homework.hw11.Family;

import java.util.ArrayList;
import java.util.List;

public class CollectionFamilyDao implements FamilyDao<Family> {
    public static List<Family> families=new ArrayList<>();
    @Override
    public List<Family> getAllFamilies() {
        return families;
    }

    @Override
    public Family getFamilyByIndex(int index) {
        return families.get(index);
    }

    @Override
    public boolean deleteFamily(int index) {
        for (int i = 0; i <families.size() ; i++) {
            if (i == index) {
                families.remove(index);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean deleteFamily(Family f) {
        if (families.contains(f)){
            families.remove(f);
            return true;
        }
        return false;
    }

    @Override
    public void saveFamily(Family f) {
        if (families.contains(f)){
            families.remove(f);
            families.add(f);
        }
        families.add(f);
    }
}
