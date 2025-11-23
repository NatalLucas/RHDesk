# HRDesk
Projeto de Sistema de administração do Setor de Recursos Humanos, tendo como foco, soluções para automação e desburocratização do Fechamento de Ponto

# HRDesk — Sistema Completo de Gestão de RH

O **HRDesk** é uma plataforma moderna e modular para digitalização e automação de processos de Recursos Humanos.  
O projeto nasce com o objetivo de criar uma solução **rápida, intuitiva, segura e flexível**, capaz de atender desde equipes pequenas até grandes departamentos de RH.

Este repositório organiza os componentes do sistema para que diferentes colaboradores possam contribuir de forma escalável.

---

## 🚀 Visão Geral do Projeto

O HRDesk será um **ecossistema de RH completo**, incluindo:

### ✔ Sistema de Registro de Ponto  
- REP via celular com validações de segurança  
- Geolocalização confiável  
- Registro online e offline  
- Painel administrativo para monitoramento

### ✔ Módulo de Departamento Pessoal (DP)  
- Controle de horas extras  
- Banco de horas  
- Gestão de atestados  
- Controle de férias  
- Movimentações (admissão, demissão, transferências)

### ✔ Módulo de RH Estratégico  
- Avaliação de desempenho  
- Feedbacks  
- Competências  
- Indicadores e dashboards

### ✔ Aplicativo Mobile  
- Registro de ponto  
- Espelho de ponto  
- Solicitações (férias, atestado, ajustes, etc.)

### ✔ Backend robusto  
- API segura  
- Armazenamento organizado  
- Autenticação e autorização  
- Integração com sistemas externos

---

## 🏗 Arquitetura Inicial do Repositório

A estrutura base do projeto:

A estrutura base do projeto:

HRDesk/
│
├── backend/ # API e lógica de negócio (Spring Boot)
├── mobile/ # Aplicativo mobile (React Native / Flutter)
├── web/ # Painel administrativo (opcional nesta fase)
│
├── docs/ # Documentações do projeto
│ ├── organograma.png
│ ├── requisitos.md
│ ├── arquitetura.md
│ └── roadmap.md
│
├── .gitignore
└── README.md

markdown
Copiar código

---

## 🎯 Objetivo Geral

Criar uma solução de RH **completa**, **escalável** e **simples de usar**, permitindo que empresas gerenciem pessoas de forma centralizada, reduzindo retrabalho e aumentando eficiência operacional.

---

## 🔍 Objetivos Específicos

- Criar um sistema modular e fácil de manter  
- Garantir segurança dos dados e confiabilidade dos registros  
- Automatizar rotinas que hoje são manuais  
- Prover dashboards com indicadores críticos de RH/DP  
- Entregar experiência moderna tanto no painel web quanto no app

---

## 🛠 Tecnologias (previsão)

### **Backend**
- Java + Spring Boot  
- Spring Security  
- JPA / Hibernate  
- PostgreSQL ou MySQL  
- JWT  
- Swagger para documentação

### **Mobile**
- React Native *ou* Flutter  
- API REST  
- Armazenamento local (para modo offline)  

### **Infraestrutura**
- Docker  
- CI/CD  
- Versionamento Git  
- Deploy em ambiente cloud (a definir)

---

## 📅 Roadmap Inicial

### **Fase 1 — Estruturação**
- Criar arquitetura do backend  
- Criar skeleton do app mobile  
- Organizar fluxo de commits e branches  
- Criar documentação base  

### **Fase 2 — Módulo de Ponto**
- Registro via celular  
- Ajustes com segurança  
- Gerador de espelho  
- Painel do gestor

### **Fase 3 — Módulo DP**
- Banco de horas  
- HE 50/100  
- Atestados  
- Férias  
- Admissão e desligamento

### **Fase 4 — Módulo Estratégico**
- Competências  
- Avaliação 360°  
- Feedback contínuo  
- Relatórios gerenciais  

### **Fase 5 — Otimização e Escalabilidade**
- Testes automatizados  
- Monitoramento  
- Ajustes de performance  

---

## 🤝 Como Contribuir

1. Faça um fork do projeto  
2. Crie uma branch com sua feature:
git checkout -b feat/minha-feature

css
Copiar código
3. Faça commits limpos e padronizados:
feat: implementa registro de ponto
fix: corrige validação de token
docs: adiciona requisitos do módulo DP

yaml
Copiar código
4. Abra um Pull Request explicando claramente o que foi feito

---

## 📚 Documentações

Todo colaborador deve consultar a pasta `/docs` antes de contribuir.

Documentos disponíveis:
- **Organograma geral do projeto**
- **Arquitetura prevista**
- **Requisitos funcionais**
- **Roadmap detalhado**

---

## 📌 Status do Projeto

> **Em fase de estruturação inicial.**  
> A documentação, arquitetura e módulos estão sendo organizados para iniciar o desenvolvimento colaborativo.

---

## ❤️ Agradecimentos

Obrigado a todos os colaboradores que estão ajudando a construir este projeto.  
O HRDesk nasce para ser uma ferramenta sólida, moderna e eficiente — e cada contribuição faz diferença.

