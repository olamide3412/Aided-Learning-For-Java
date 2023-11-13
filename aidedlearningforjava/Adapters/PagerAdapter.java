package com.skycoming.aidedlearningforjava.Adapters;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;


import com.skycoming.aidedlearningforjava.Fragments.ArrayFragment;
import com.skycoming.aidedlearningforjava.Fragments.BasicDatatypeFragment;
import com.skycoming.aidedlearningforjava.Fragments.BasicOperatorsFragment;
import com.skycoming.aidedlearningforjava.Fragments.BasicSyntaxFragment;
import com.skycoming.aidedlearningforjava.Fragments.CharacterFragment;
import com.skycoming.aidedlearningforjava.Fragments.ConstructorFragment;
import com.skycoming.aidedlearningforjava.Fragments.DecisionMakingFragment;
import com.skycoming.aidedlearningforjava.Fragments.HomeFragment;
import com.skycoming.aidedlearningforjava.Fragments.JavaEnviromentSetupFragment;
import com.skycoming.aidedlearningforjava.Fragments.LoopControlFragment;
import com.skycoming.aidedlearningforjava.Fragments.MethodsFragment;
import com.skycoming.aidedlearningforjava.Fragments.ModifierTypesFragment;
import com.skycoming.aidedlearningforjava.Fragments.NumberFragment;
import com.skycoming.aidedlearningforjava.Fragments.ObjectClassesFragment;
import com.skycoming.aidedlearningforjava.Fragments.OverViewFragment;
import com.skycoming.aidedlearningforjava.Fragments.RegularExpressionFragment;
import com.skycoming.aidedlearningforjava.Fragments.StringFragment;
import com.skycoming.aidedlearningforjava.Fragments.VariableTypesFragment;


public class PagerAdapter extends FragmentPagerAdapter {

    private static final int count = 17;
    private final HomeFragment homeFragment;
    private final OverViewFragment overViewFragment;
    private final JavaEnviromentSetupFragment javaEnviromentSetupFragment;
    private final BasicSyntaxFragment basicSyntaxFragment;
    private final ObjectClassesFragment objectClassesFragment;
    private final ConstructorFragment constructorFragment;

    private final BasicDatatypeFragment basicDatatypeFragment;
    private final VariableTypesFragment variableTypesFragment;
    private final ModifierTypesFragment modifierTypesFragment;
    private final BasicOperatorsFragment basicOperatorsFragment;
    private final LoopControlFragment loopControlFragment;
    private final DecisionMakingFragment decisionMakingFragment;
    private final NumberFragment numberFragment;

    private final CharacterFragment characterFragment;
    private final StringFragment stringFragment;
    private final ArrayFragment arrayFragment;
    private final MethodsFragment methodsFragment;



    public PagerAdapter(@NonNull FragmentManager fm) {
        super(fm);
        homeFragment = new HomeFragment();
        overViewFragment = new OverViewFragment();
        javaEnviromentSetupFragment = new JavaEnviromentSetupFragment();
        basicSyntaxFragment = new BasicSyntaxFragment();
        objectClassesFragment = new ObjectClassesFragment();
        constructorFragment = new ConstructorFragment();

        basicDatatypeFragment = new BasicDatatypeFragment();
        variableTypesFragment = new VariableTypesFragment();
        modifierTypesFragment = new ModifierTypesFragment();
        basicOperatorsFragment = new BasicOperatorsFragment();
        loopControlFragment = new LoopControlFragment();
        decisionMakingFragment = new DecisionMakingFragment();
        numberFragment = new NumberFragment();

        characterFragment = new CharacterFragment();
        stringFragment = new StringFragment();
        arrayFragment = new ArrayFragment();
        methodsFragment = new MethodsFragment();
    }


    @NonNull
    @Override
    public Fragment getItem(int i) {
        if (i == 0 ){

            return homeFragment;
        }


        else if (i==1){
            return overViewFragment;
        }

        else if (i==2){
            return javaEnviromentSetupFragment;
        }

        else if (i==3){
            return basicSyntaxFragment;
        }

        else if (i==4){
            return objectClassesFragment;
        }

        else if (i==5){
            return constructorFragment;
        }


        else if (i==6){
            return basicDatatypeFragment;
        }else if (i==7){
            return variableTypesFragment;
        }else if (i==8){
            return modifierTypesFragment;
        }else if (i==9){
            return basicOperatorsFragment;
        }else if (i==10){
            return loopControlFragment;
        }else if (i==11){
            return decisionMakingFragment;
        }else if (i==12){
            return numberFragment;
        }

        else if (i==13){
            return characterFragment;
        }
        else if (i==14){
            return stringFragment;
        }
        else if (i==15){
            return arrayFragment;
        }
        else if (i==16){
            return methodsFragment;
        }





        else {
            return homeFragment;
        }
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0){
           // return  "Images";
        } else {
          //  return "Videos";
        }

        return null;
    }

    @Override
    public int getCount() {
        return count;
    }



}
