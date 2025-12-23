# Como Contribuir com o HRDesk

Obrigado por querer contribuir com o HRDesk!  
Este arquivo descreve **o processo de contribuição**, as **regras de governança** e o **fluxo de trabalho** esperado para manter a qualidade do projeto.

---

## 🎯 Visão Geral do Fluxo de Branches

O HRDesk segue um fluxo claro de branches para manter organização e qualidade:

- `main` → ⚠️ produção (somente código estável)
- `develop` → 🧪 integração de funcionalidades (padrão do repositório)
- `feature/*` → 🚧 desenvolvimento de cada funcionalidade isolada

> **IMPORTANTE:**  
> Push direto nas branches `main` ou `develop` **não é permitido**.  
> Todas as alterações devem passar por **Pull Request** (PR).

---

## 🧱 Criando um Branch para Contribuir

1. Na sua máquina local:
```bash
git checkout develop
git pull origin develop
git checkout -b feature/<descritivo-da-feature>
Trabalhe no seu código

Faça commits claros e pequenos

Suba sua branch:


git push origin feature/<descritivo-da-feature>
🧹 Padrão de Commits
Use mensagens de commit no seguinte padrão (baseado em Conventional Commits):

feat: para novas funcionalidades

fix: para correções de bugs

docs: para atualizações de documentação

chore: para tarefas de manutenção

refactor: para reorganização de código sem nova funcionalidade

Exemplo:


feat: adiciona endpoint de listagem de colaboradores
fix: corrige validação de CPF
docs: atualiza instruções no README
📋 Pull Requests
Crie PRs apontando para a branch develop

Dê um título claro e uma descrição que explique:

o que foi feito

por quê foi feito

quais problemas resolve

Relacione issues quando relevante

🐘 Regras de Banco de Dados (Flyway)
Sempre que uma alteração estrutural no banco for necessária, ela deve ser feita via migration SQL usando Flyway:

Não edite migrations já aplicadas

Para cada alteração, crie um novo arquivo de migration

Coloque na pasta src/main/resources/db/migration

Exemplo de nome de migration:


V5__add_status_to_employee.sql
❌ O Que Evitar
❌ Push direto em main ou develop

❌ Commits sem mensagem clara

❌ Criar migrations duplicadas ou inconsistentes

❌ Usar ddl-auto=create em produção

🧠 Boas Práticas
Entender o domínio antes de implementar

Testar localmente antes de abrir PR

Manter o código limpo e legível

Atualizar a documentação quando necessário

✨ Obrigado!
Sua contribuição fortalece o projeto.
Obrigado por fazer parte do desenvolvimento do HRDesk! 🚀

