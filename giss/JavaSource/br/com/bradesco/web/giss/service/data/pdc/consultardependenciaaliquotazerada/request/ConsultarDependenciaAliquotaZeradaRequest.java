/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id: ConsultarDependenciaAliquotaZeradaRequest.java,v 1.4 2018/04/24 02:27:11 gmichelini Exp $
 */

package br.com.bradesco.web.giss.service.data.pdc.consultardependenciaaliquotazerada.request;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import java.io.IOException;
import java.io.Reader;
import java.io.Serializable;
import java.io.Writer;
import org.exolab.castor.xml.MarshalException;
import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;
import org.exolab.castor.xml.ValidationException;
import org.xml.sax.ContentHandler;

/**
 * Class ConsultarDependenciaAliquotaZeradaRequest.
 * 
 * @version $Revision: 1.4 $ $Date: 2018/04/24 02:27:11 $
 */
public class ConsultarDependenciaAliquotaZeradaRequest implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _qtdeRegistro
     */
    private int _qtdeRegistro = 0;

    /**
     * keeps track of state for field: _qtdeRegistro
     */
    private boolean _has_qtdeRegistro;

    /**
     * Field _mesAnoApuracaoInicial
     */
    private int _mesAnoApuracaoInicial = 0;

    /**
     * keeps track of state for field: _mesAnoApuracaoInicial
     */
    private boolean _has_mesAnoApuracaoInicial;

    /**
     * Field _mesAnoApuracaoFinal
     */
    private int _mesAnoApuracaoFinal = 0;

    /**
     * keeps track of state for field: _mesAnoApuracaoFinal
     */
    private boolean _has_mesAnoApuracaoFinal;

    /**
     * Field _codMunicipio
     */
    private long _codMunicipio = 0;

    /**
     * keeps track of state for field: _codMunicipio
     */
    private boolean _has_codMunicipio;

    /**
     * Field _codPessoaJurid
     */
    private long _codPessoaJurid = 0;

    /**
     * keeps track of state for field: _codPessoaJurid
     */
    private boolean _has_codPessoaJurid;

    /**
     * Field _codDependencia
     */
    private int _codDependencia = 0;

    /**
     * keeps track of state for field: _codDependencia
     */
    private boolean _has_codDependencia;


      //----------------/
     //- Constructors -/
    //----------------/

    public ConsultarDependenciaAliquotaZeradaRequest() 
     {
        super();
    } //-- br.com.bradesco.web.giss.service.data.pdc.consultardependenciaaliquotazerada.request.ConsultarDependenciaAliquotaZeradaRequest()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method deleteCodDependencia
     * 
     */
    public void deleteCodDependencia()
    {
        this._has_codDependencia= false;
    } //-- void deleteCodDependencia() 

    /**
     * Method deleteCodMunicipio
     * 
     */
    public void deleteCodMunicipio()
    {
        this._has_codMunicipio= false;
    } //-- void deleteCodMunicipio() 

    /**
     * Method deleteCodPessoaJurid
     * 
     */
    public void deleteCodPessoaJurid()
    {
        this._has_codPessoaJurid= false;
    } //-- void deleteCodPessoaJurid() 

    /**
     * Method deleteMesAnoApuracaoFinal
     * 
     */
    public void deleteMesAnoApuracaoFinal()
    {
        this._has_mesAnoApuracaoFinal= false;
    } //-- void deleteMesAnoApuracaoFinal() 

    /**
     * Method deleteMesAnoApuracaoInicial
     * 
     */
    public void deleteMesAnoApuracaoInicial()
    {
        this._has_mesAnoApuracaoInicial= false;
    } //-- void deleteMesAnoApuracaoInicial() 

    /**
     * Method deleteQtdeRegistro
     * 
     */
    public void deleteQtdeRegistro()
    {
        this._has_qtdeRegistro= false;
    } //-- void deleteQtdeRegistro() 

    /**
     * Returns the value of field 'codDependencia'.
     * 
     * @return int
     * @return the value of field 'codDependencia'.
     */
    public int getCodDependencia()
    {
        return this._codDependencia;
    } //-- int getCodDependencia() 

    /**
     * Returns the value of field 'codMunicipio'.
     * 
     * @return long
     * @return the value of field 'codMunicipio'.
     */
    public long getCodMunicipio()
    {
        return this._codMunicipio;
    } //-- long getCodMunicipio() 

    /**
     * Returns the value of field 'codPessoaJurid'.
     * 
     * @return long
     * @return the value of field 'codPessoaJurid'.
     */
    public long getCodPessoaJurid()
    {
        return this._codPessoaJurid;
    } //-- long getCodPessoaJurid() 

    /**
     * Returns the value of field 'mesAnoApuracaoFinal'.
     * 
     * @return int
     * @return the value of field 'mesAnoApuracaoFinal'.
     */
    public int getMesAnoApuracaoFinal()
    {
        return this._mesAnoApuracaoFinal;
    } //-- int getMesAnoApuracaoFinal() 

    /**
     * Returns the value of field 'mesAnoApuracaoInicial'.
     * 
     * @return int
     * @return the value of field 'mesAnoApuracaoInicial'.
     */
    public int getMesAnoApuracaoInicial()
    {
        return this._mesAnoApuracaoInicial;
    } //-- int getMesAnoApuracaoInicial() 

    /**
     * Returns the value of field 'qtdeRegistro'.
     * 
     * @return int
     * @return the value of field 'qtdeRegistro'.
     */
    public int getQtdeRegistro()
    {
        return this._qtdeRegistro;
    } //-- int getQtdeRegistro() 

    /**
     * Method hasCodDependencia
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCodDependencia()
    {
        return this._has_codDependencia;
    } //-- boolean hasCodDependencia() 

    /**
     * Method hasCodMunicipio
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCodMunicipio()
    {
        return this._has_codMunicipio;
    } //-- boolean hasCodMunicipio() 

    /**
     * Method hasCodPessoaJurid
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCodPessoaJurid()
    {
        return this._has_codPessoaJurid;
    } //-- boolean hasCodPessoaJurid() 

    /**
     * Method hasMesAnoApuracaoFinal
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasMesAnoApuracaoFinal()
    {
        return this._has_mesAnoApuracaoFinal;
    } //-- boolean hasMesAnoApuracaoFinal() 

    /**
     * Method hasMesAnoApuracaoInicial
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasMesAnoApuracaoInicial()
    {
        return this._has_mesAnoApuracaoInicial;
    } //-- boolean hasMesAnoApuracaoInicial() 

    /**
     * Method hasQtdeRegistro
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasQtdeRegistro()
    {
        return this._has_qtdeRegistro;
    } //-- boolean hasQtdeRegistro() 

    /**
     * Method isValid
     * 
     * 
     * 
     * @return boolean
     */
    public boolean isValid()
    {
        try {
            validate();
        }
        catch (org.exolab.castor.xml.ValidationException vex) {
            return false;
        }
        return true;
    } //-- boolean isValid() 

    /**
     * Method marshal
     * 
     * 
     * 
     * @param out
     */
    public void marshal(java.io.Writer out)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        
        Marshaller.marshal(this, out);
    } //-- void marshal(java.io.Writer) 

    /**
     * Method marshal
     * 
     * 
     * 
     * @param handler
     */
    public void marshal(org.xml.sax.ContentHandler handler)
        throws java.io.IOException, org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        
        Marshaller.marshal(this, handler);
    } //-- void marshal(org.xml.sax.ContentHandler) 

    /**
     * Sets the value of field 'codDependencia'.
     * 
     * @param codDependencia the value of field 'codDependencia'.
     */
    public void setCodDependencia(int codDependencia)
    {
        this._codDependencia = codDependencia;
        this._has_codDependencia = true;
    } //-- void setCodDependencia(int) 

    /**
     * Sets the value of field 'codMunicipio'.
     * 
     * @param codMunicipio the value of field 'codMunicipio'.
     */
    public void setCodMunicipio(long codMunicipio)
    {
        this._codMunicipio = codMunicipio;
        this._has_codMunicipio = true;
    } //-- void setCodMunicipio(long) 

    /**
     * Sets the value of field 'codPessoaJurid'.
     * 
     * @param codPessoaJurid the value of field 'codPessoaJurid'.
     */
    public void setCodPessoaJurid(long codPessoaJurid)
    {
        this._codPessoaJurid = codPessoaJurid;
        this._has_codPessoaJurid = true;
    } //-- void setCodPessoaJurid(long) 

    /**
     * Sets the value of field 'mesAnoApuracaoFinal'.
     * 
     * @param mesAnoApuracaoFinal the value of field
     * 'mesAnoApuracaoFinal'.
     */
    public void setMesAnoApuracaoFinal(int mesAnoApuracaoFinal)
    {
        this._mesAnoApuracaoFinal = mesAnoApuracaoFinal;
        this._has_mesAnoApuracaoFinal = true;
    } //-- void setMesAnoApuracaoFinal(int) 

    /**
     * Sets the value of field 'mesAnoApuracaoInicial'.
     * 
     * @param mesAnoApuracaoInicial the value of field
     * 'mesAnoApuracaoInicial'.
     */
    public void setMesAnoApuracaoInicial(int mesAnoApuracaoInicial)
    {
        this._mesAnoApuracaoInicial = mesAnoApuracaoInicial;
        this._has_mesAnoApuracaoInicial = true;
    } //-- void setMesAnoApuracaoInicial(int) 

    /**
     * Sets the value of field 'qtdeRegistro'.
     * 
     * @param qtdeRegistro the value of field 'qtdeRegistro'.
     */
    public void setQtdeRegistro(int qtdeRegistro)
    {
        this._qtdeRegistro = qtdeRegistro;
        this._has_qtdeRegistro = true;
    } //-- void setQtdeRegistro(int) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return ConsultarDependenciaAliquotaZeradaRequest
     */
    public static br.com.bradesco.web.giss.service.data.pdc.consultardependenciaaliquotazerada.request.ConsultarDependenciaAliquotaZeradaRequest unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.consultardependenciaaliquotazerada.request.ConsultarDependenciaAliquotaZeradaRequest) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.consultardependenciaaliquotazerada.request.ConsultarDependenciaAliquotaZeradaRequest.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.consultardependenciaaliquotazerada.request.ConsultarDependenciaAliquotaZeradaRequest unmarshal(java.io.Reader) 

    /**
     * Method validate
     * 
     */
    public void validate()
        throws org.exolab.castor.xml.ValidationException
    {
        org.exolab.castor.xml.Validator validator = new org.exolab.castor.xml.Validator();
        validator.validate(this);
    } //-- void validate() 

}
