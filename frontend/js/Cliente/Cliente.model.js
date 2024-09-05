import { Config } from "../Config.js";

class Cliente {
    _id;
    _nome;
    _sobrenome;
    _documento;

    /**
     * @param {string} nome 
     * @param {string} sobrenome 
     * @param {string} documento 
     */
    constructor(nome, sobrenome, documento) {
        this._nome = nome;
        this._sobrenome = sobrenome;
        this._documento = documento;
    }

    get id() {
        return this._id;
    }

    get nome() {
        return this._nome;
    }
    set nome(value) {
        this._nome = value;
    }

    get sobrenome() {
        return this._sobrenome;
    }
    set sobrenome(value) {
        this._sobrenome = value;
    }

    get documento() {
        return this._documento;
    }
    set documento(value) {
        this._documento = value;
    }

    get isStored() {
        return this._id === undefined;
    }

    async save() {
        const res = await fetch(Config.API_URL + "/cliente", {
            method: "POST",
            body: JSON.stringify({
                nome: this._nome,
                sobrenome: this._sobrenome,
                documento: this._documento
            }),
            headers: {
                "Content-Type": "application/json"
            }
        });

        console.log(res.ok, JSON.stringify(await res.json()));
    }

    async _create() {
        const res = await fetch(Config.API_URL + "/cliente", {
            method: "POST",
            body: JSON.stringify({
                nome: this._nome,
                sobrenome: this._sobrenome,
                documento: this._documento
            }),
            headers: {
                "Content-Type": "application/json"
            }
        });

        
    }
}
