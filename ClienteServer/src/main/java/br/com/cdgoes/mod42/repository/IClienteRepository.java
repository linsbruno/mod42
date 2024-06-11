package br.com.cdgoes.mod42.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import br.com.cdgoes.mod42.domain.Cliente;

@Repository
public interface IClienteRepository extends MongoRepository<Cliente, String>{

	Optional<Cliente> findByCpf(Long cpf);
}