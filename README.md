# 🚗 Jump Park – Parking Management App

Aplicação desenvolvida como **desafio técnico**, com o objetivo de simular um sistema de **gestão de estacionamento de veículos**, cobrindo desde a entrada do veículo até o pagamento e checkout.

O projeto foi construído utilizando **Kotlin Multiplatform (KMP)**, permitindo que a mesma base de código atenda múltiplas plataformas, atualmente **Android** e **Desktop**.

---

## 🎯 Objetivo do Projeto

Criar uma aplicação multiplataforma moderna, escalável e organizada, que demonstre:

* Boas práticas de arquitetura
* Uso real de Kotlin Multiplatform
* Interface moderna com Jetpack Compose
* Separação clara de responsabilidades
* Facilidade de evolução para novas funcionalidades

---

## 🧩 Funcionalidades

### 🔐 Autenticação

* Tela de login
* Simulação de autenticação do operador

### 🏠 Dashboard Inicial

* Carregamento automático de dados operacionais
* Exibição de:

  * Total de veículos no pátio
  * Vagas disponíveis
  * Resumo de pagamentos
  * Receita total

### 🚗 Entrada de Veículo

* Cadastro de placa, modelo e cor
* Seleção do plano de tarifa:

  * Hourly
  * Daily
  * Monthly

### 📋 Lista de Veículos no Pátio

* Busca por placa, modelo ou cor
* Exibição de:

  * Horário de entrada
  * Duração da estadia
  * Status do pagamento (Paid, Unpaid, Overstay, Pre-paid)

### 💳 Checkout e Pagamento

* Detalhes da permanência
* Seleção do método de pagamento:

  * Cash
  * Credit
  * Debit
* Processamento do checkout

---

## 🏗️ Arquitetura

O projeto segue uma abordagem **multiplataforma real**, com separação clara entre UI, regras de negócio e plataforma.

### Estrutura de módulos

```
jumppark/
 ├── shared/        # Código compartilhado (UI, navegação, lógica)
 ├── androidApp/    # Entry point Android
 └── desktopApp/    # Entry point Desktop
```

### Principais conceitos

* **Compose Multiplatform** para UI
* **Navegação por estado** no módulo shared
* **Kotlinx Serialization** para modelos de dados
* Arquitetura preparada para integração com API e banco local

---

## 🛠️ Tecnologias Utilizadas

* **Kotlin Multiplatform**
* **Jetpack Compose / Compose Multiplatform**
* **Kotlinx Serialization**
* **Material Design**
* **Gradle Kotlin DSL**

---

## 📱 Plataformas Suportadas

* ✅ Android
* ✅ Desktop (JVM)

> A arquitetura permite expansão futura para Web e iOS.

---

## 🚀 Como executar o projeto

### Android

1. Abrir o projeto no Android Studio
2. Selecionar o módulo `androidApp`
3. Executar em um emulador ou dispositivo físico

### Desktop

1. Abrir o projeto no Android Studio ou IntelliJ IDEA
2. Executar a função `main()` do módulo `desktopApp`

---

## 🧠 Decisões Técnicas

* **Kotlin Multiplatform** foi escolhido para maximizar reaproveitamento de código
* **Compose** para garantir UI moderna e consistente entre plataformas
* Navegação manual por estado para compatibilidade total entre Android e Desktop
* Código organizado visando facilidade de manutenção e testes

---

## 📌 Observações

* O projeto utiliza dados simulados
* Integrações com API e banco local estão preparadas para evolução
* O foco principal é a **qualidade do código e arquitetura**, não apenas o visual

---

## 👨‍💻 Autor

Projeto desenvolvido como **desafio técnico** para demonstrar habilidades em:

* Kotlin Multiplatform
* Arquitetura de aplicações
* UI moderna com Compose

---

## 📄 Licença

Este projeto é apenas para fins educacionais e demonstrativos.
