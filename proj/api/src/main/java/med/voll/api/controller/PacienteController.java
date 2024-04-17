package med.voll.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//rever aqui - inicio
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
//rever aqui - fim

import med.voll.api.paciente.DadosCadastroPaciente;
import med.voll.api.paciente.DadosListaPaciente;
import med.voll.api.paciente.Paciente;
import med.voll.api.paciente.PacienteRepository;

@RestController
@RequestMapping("pacientes")
public class PacienteController {

    @Autowired
    private PacienteRepository repository;

    @PostMapping
    @Transactional
    public void cadastrar(@RequestBody @Valid DadosCadastroPaciente dados) {
        repository.save(new Paciente(dados));
    }

    @GetMapping
    public List<DadosListaPaciente> listar(){
        return repository.findAll().stream().map(DadosListaPaciente::new).toList();
    }
}