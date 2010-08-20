/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package autopecas.logica;

import java.util.Calendar;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Ruan
 */
@Entity
public class Produto {
   @Id
   @GeneratedValue(strategy=GenerationType.AUTO)
    private  int codigoProduto;
    private String nomeProduto;
    private String unidadeProduto;
    private String referenciaProduto;
    private int grupoCodigo;
    private String fabricanteProduto;
    private String classificacaoProduto;
    private double custoProduto;
    private double medioProduto;
    private double vendaProduto;
    private String alfaProduto;
    private String aplicacaoProduto;
    private String codigoBarraProduto;
    private int codigoFabricaProduto;
    private int ultimaNotaProduto;
    private int codigoFornecedor;
    @Temporal(TemporalType.DATE)
    private Calendar ultimaCompraProduto;
    private int ultimaQuantidadeProduto;
    @Temporal(TemporalType.DATE)
    private Calendar ultimoMovimentoProduto;
    @Temporal(TemporalType.DATE)
    private Calendar ultimaVendaProduto;
    private int estoqueProduto;
    @Temporal(TemporalType.DATE)
    private Calendar dataCadastro;

    public String getAlfaProduto() {
        return alfaProduto;
    }

    public void setAlfaProduto(String alfaProduto) {
        this.alfaProduto = alfaProduto;
    }

    public String getAplicacaoProduto() {
        return aplicacaoProduto;
    }

    public void setAplicacaoProduto(String aplicacaoProduto) {
        this.aplicacaoProduto = aplicacaoProduto;
    }

    public String getClassificacaoProduto() {
        return classificacaoProduto;
    }

    public void setClassificacaoProduto(String classificacaoProduto) {
        this.classificacaoProduto = classificacaoProduto;
    }

    public String getCodigoBarraProduto() {
        return codigoBarraProduto;
    }

    public void setCodigoBarraProduto(String codigoBarraProduto) {
        this.codigoBarraProduto = codigoBarraProduto;
    }

    public int getCodigoFabricaProduto() {
        return codigoFabricaProduto;
    }

    public void setCodigoFabricaProduto(int codigoFabricaProduto) {
        this.codigoFabricaProduto = codigoFabricaProduto;
    }

    public int getCodigoFornecedor() {
        return codigoFornecedor;
    }

    public void setCodigoFornecedor(int codigoFornecedor) {
        this.codigoFornecedor = codigoFornecedor;
    }

    public int getCodigoProduto() {
        return codigoProduto;
    }

    public void setCodigoProduto(int codigoProduto) {
        this.codigoProduto = codigoProduto;
    }

    public double getCustoProduto() {
        return custoProduto;
    }

    public void setCustoProduto(double custoProduto) {
        this.custoProduto = custoProduto;
    }
    public Calendar getDataCadastro(){
        return dataCadastro;
    }
    public void setDataCadastro(Calendar dataCadastro){
        this.dataCadastro = dataCadastro;
    }

    public int getEstoqueProduto() {
        return estoqueProduto;
    }

    public void setEstoqueProduto(int estoqueProduto) {
        this.estoqueProduto = estoqueProduto;
    }

    public String getFabricanteProduto() {
        return fabricanteProduto;
    }

    public void setFabricanteProduto(String fabricanteProduto) {
        this.fabricanteProduto = fabricanteProduto;
    }

    public int getGrupoCodigo() {
        return grupoCodigo;
    }

    public void setGrupoCodigo(int grupoCodigo) {
        this.grupoCodigo = grupoCodigo;
    }

    public double getMedioProduto() {
        return medioProduto;
    }

    public void setMedioProduto(double medioProduto) {
        this.medioProduto = medioProduto;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public String getReferenciaProduto() {
        return referenciaProduto;
    }

    public void setReferenciaProduto(String referenciaProduto) {
        this.referenciaProduto = referenciaProduto;
    }

    public Calendar getUltimaCompraProduto() {
        return ultimaCompraProduto;
    }

    public void setUltimaCompraProduto(Calendar ultimaCompraProduto) {
        this.ultimaCompraProduto = ultimaCompraProduto;
    }

    public int getUltimaNotaProduto() {
        return ultimaNotaProduto;
    }

    public void setUltimaNotaProduto(int ultimaNotaProduto) {
        this.ultimaNotaProduto = ultimaNotaProduto;
    }

    public int getUltimaQuantidadeProduto() {
        return ultimaQuantidadeProduto;
    }

    public void setUltimaQuantidadeProduto(int ultimaQuantidadeProduto) {
        this.ultimaQuantidadeProduto = ultimaQuantidadeProduto;
    }

    public Calendar getUltimaVendaProduto() {
        return ultimaVendaProduto;
    }

    public void setUltimaVendaProduto(Calendar ultimaVendaProduto) {
        this.ultimaVendaProduto = ultimaVendaProduto;
    }

    public Calendar getUltimoMovimentoProduto() {
        return ultimoMovimentoProduto;
    }

    public void setUltimoMovimentoProduto(Calendar ultimoMovimentoProduto) {
        this.ultimoMovimentoProduto = ultimoMovimentoProduto;
    }

    public String getUnidadeProduto() {
        return unidadeProduto;
    }

    public void setUnidadeProduto(String unidadeProduto) {
        this.unidadeProduto = unidadeProduto;
    }

    public double getVendaProduto() {
        return vendaProduto;
    }

    public void setVendaProduto(double vendaProduto) {
        this.vendaProduto = vendaProduto;
    }

}
