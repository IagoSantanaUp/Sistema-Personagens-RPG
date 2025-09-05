# 🎮 Sistema de Personagens RPG

## 📋 Sobre o Projeto

Sistema básico de criação e gerenciamento de personagens para jogos RPG, desenvolvido como parte dos estudos de **Programação Orientada a Objetos (POO)** em Java. Este projeto foca nos conceitos fundamentais de **Classes, Objetos e Encapsulamento**.

**Empresa Simulada:** GameCraft Entertainment  
**Departamento:** Gameplay Programming  
**Objetivo:** Criar um sistema robusto de personagens com atributos protegidos e validações de regras de negócio.

## 🎯 Funcionalidades

### 🛡️ Atributos do Personagem
- **Nome:** Identificação única do personagem (3-15 caracteres)
- **Nível:** Progressão do personagem (1-100)
- **Pontos de Vida:** Sistema de saúde (0-1000)
- **Pontos de Mana:** Sistema de energia mágica (0-500)
- **Experiência:** Sistema de progressão
- **Classe:** Especialização do personagem (Guerreiro, Mago, Arqueiro)

### ⚔️ Sistema de Combate
- **Receber Dano:** Reduz pontos de vida com validações
- **Usar Mana:** Sistema de custo de habilidades
- **Regeneração:** Restauração automática ao subir de nível

### 📈 Sistema de Progressão
- **Ganhar Experiência:** Acúmulo de XP por ações
- **Subir de Nível:** Aumento automático de nível com benefícios
- **Status Display:** Visualização completa dos atributos

## 🔒 Conceitos de POO Implementados

### Encapsulamento
- ✅ **Atributos Privados:** Todos os dados protegidos da manipulação externa
- ✅ **Getters/Setters:** Acesso controlado aos atributos
- ✅ **Validações:** Regras de negócio implementadas nos setters
- ✅ **Integridade:** Proteção do estado interno da classe

### Validações Implementadas
| Atributo | Regra de Validação |
|----------|-------------------|
| Nome | Mínimo 3, máximo 15 caracteres |
| Nível | Entre 1 e 100 |
| Pontos de Vida | Entre 0 e 1000 |
| Pontos de Mana | Entre 0 e 500 |
| Experiência | Não pode ser negativa |
| Classe | Apenas: Guerreiro, Mago, Arqueiro |

## 🚀 Como Executar

### Pré-requisitos
- Java JDK 8 ou superior
- IDE de sua preferência (Eclipse, IntelliJ, VS Code)

### Passos
1. Clone o repositório:
```bash
git clone https://github.com/seu-usuario/sistema-personagem-rpg.git
