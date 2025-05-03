package com.backend.service;

import com.backend.model.Pessoa;
import com.backend.repository.PessoaRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class PessoaService {

    private final PessoaRepository pessoaRepository;

    public PessoaService(PessoaRepository pessoaRepository) {
        this.pessoaRepository = pessoaRepository;
    }

    public List<Pessoa> listarTodos() {
        return pessoaRepository.findAll();
    }

    public Optional<Pessoa> buscarPorId(Long id) {
        return pessoaRepository.findById(id);
    }

    public Pessoa salvar(Pessoa pessoa) {
        // Definir timestamps
        LocalDateTime agora = LocalDateTime.now();
        if (pessoa.getId() == null) {
            pessoa.setCreatedAt(agora);
        }
        pessoa.setUpdatedAt(agora);
        
        return pessoaRepository.save(pessoa);
    }

    public void excluir(Long id) {
        pessoaRepository.deleteById(id);
    }
}