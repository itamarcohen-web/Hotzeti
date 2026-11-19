package cohen.itamar.hotzeti;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class RegisterFragment extends Fragment {

    private EditText firstNameInput;
    private EditText lastNameInput;
    private EditText phoneInput;
    private EditText emailRegisterInput;
    private EditText passwordRegisterInput;
    private EditText confirmPasswordInput;
    private CheckBox termsCheckBox;
    private Button registerButton;

    public RegisterFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(
            @NonNull LayoutInflater inflater,
            @Nullable ViewGroup container,
            @Nullable Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_register, container, false);
    }

    @Override
    public void onViewCreated(
            @NonNull View view,
            @Nullable Bundle savedInstanceState) {

        super.onViewCreated(view, savedInstanceState);

        firstNameInput = view.findViewById(R.id.firstNameInput);
        lastNameInput = view.findViewById(R.id.lastNameInput);
        phoneInput = view.findViewById(R.id.phoneInput);
        emailRegisterInput = view.findViewById(R.id.emailRegisterInput);
        passwordRegisterInput = view.findViewById(R.id.passwordRegisterInput);
        confirmPasswordInput = view.findViewById(R.id.confirmPasswordInput);
        termsCheckBox = view.findViewById(R.id.termsCheckBox);
        registerButton = view.findViewById(R.id.registerButton);
    }
}