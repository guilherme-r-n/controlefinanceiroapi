package guilherme.controlefinanceiro.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import guilherme.controlefinanceiro.entity.UsuarioEntity;

public interface UsuarioRepository extends JpaRepository<UsuarioEntity, Long> {

}
