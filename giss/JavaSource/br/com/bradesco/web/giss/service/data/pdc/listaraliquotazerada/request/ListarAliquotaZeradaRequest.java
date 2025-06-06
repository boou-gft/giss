/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id: ListarAliquotaZeradaRequest.java,v 1.3 2017/07/28 19:14:37 gilbertocopoli Exp $
 */

package br.com.bradesco.web.giss.service.data.pdc.listaraliquotazerada.request;

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
 * Class ListarAliquotaZeradaRequest.
 * 
 * @version $Revision: 1.3 $ $Date: 2017/07/28 19:14:37 $
 */
public class ListarAliquotaZeradaRequest implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _nroMaxOcorrencias
     */
    private int _nroMaxOcorrencias = 0;

    /**
     * keeps track of state for field: _nroMaxOcorrencias
     */
    private boolean _has_nroMaxOcorrencias;

    /**
     * Field _codigoPessaoJuridica
     */
    private long _codigoPessaoJuridica = 0;

    /**
     * keeps track of state for field: _codigoPessaoJuridica
     */
    private boolean _has_codigoPessaoJuridica;

    /**
     * Field _nroSeqUndOrganizacional
     */
    private int _nroSeqUndOrganizacional = 0;

    /**
     * keeps track of state for field: _nroSeqUndOrganizacional
     */
    private boolean _has_nroSeqUndOrganizacional;

    /**
     * Field _mesAnoApuracao
     */
    private int _mesAnoApuracao = 0;

    /**
     * keeps track of state for field: _mesAnoApuracao
     */
    private boolean _has_mesAnoApuracao;

    /**
     * Field _codigoMunicipio
     */
    private long _codigoMunicipio = 0;

    /**
     * keeps track of state for field: _codigoMunicipio
     */
    private boolean _has_codigoMunicipio;


      //----------------/
     //- Constructors -/
    //----------------/

    public ListarAliquotaZeradaRequest() 
     {
        super();
    } //-- br.com.bradesco.web.giss.service.data.pdc.listaraliquotazerada.request.ListarAliquotaZeradaRequest()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method deleteCodigoMunicipio
     * 
     */
    public void deleteCodigoMunicipio()
    {
        this._has_codigoMunicipio= false;
    } //-- void deleteCodigoMunicipio() 

    /**
     * Method deleteCodigoPessaoJuridica
     * 
     */
    public void deleteCodigoPessaoJuridica()
    {
        this._has_codigoPessaoJuridica= false;
    } //-- void deleteCodigoPessaoJuridica() 

    /**
     * Method deleteMesAnoApuracao
     * 
     */
    public void deleteMesAnoApuracao()
    {
        this._has_mesAnoApuracao= false;
    } //-- void deleteMesAnoApuracao() 

    /**
     * Method deleteNroMaxOcorrencias
     * 
     */
    public void deleteNroMaxOcorrencias()
    {
        this._has_nroMaxOcorrencias= false;
    } //-- void deleteNroMaxOcorrencias() 

    /**
     * Method deleteNroSeqUndOrganizacional
     * 
     */
    public void deleteNroSeqUndOrganizacional()
    {
        this._has_nroSeqUndOrganizacional= false;
    } //-- void deleteNroSeqUndOrganizacional() 

    /**
     * Returns the value of field 'codigoMunicipio'.
     * 
     * @return long
     * @return the value of field 'codigoMunicipio'.
     */
    public long getCodigoMunicipio()
    {
        return this._codigoMunicipio;
    } //-- long getCodigoMunicipio() 

    /**
     * Returns the value of field 'codigoPessaoJuridica'.
     * 
     * @return long
     * @return the value of field 'codigoPessaoJuridica'.
     */
    public long getCodigoPessaoJuridica()
    {
        return this._codigoPessaoJuridica;
    } //-- long getCodigoPessaoJuridica() 

    /**
     * Returns the value of field 'mesAnoApuracao'.
     * 
     * @return int
     * @return the value of field 'mesAnoApuracao'.
     */
    public int getMesAnoApuracao()
    {
        return this._mesAnoApuracao;
    } //-- int getMesAnoApuracao() 

    /**
     * Returns the value of field 'nroMaxOcorrencias'.
     * 
     * @return int
     * @return the value of field 'nroMaxOcorrencias'.
     */
    public int getNroMaxOcorrencias()
    {
        return this._nroMaxOcorrencias;
    } //-- int getNroMaxOcorrencias() 

    /**
     * Returns the value of field 'nroSeqUndOrganizacional'.
     * 
     * @return int
     * @return the value of field 'nroSeqUndOrganizacional'.
     */
    public int getNroSeqUndOrganizacional()
    {
        return this._nroSeqUndOrganizacional;
    } //-- int getNroSeqUndOrganizacional() 

    /**
     * Method hasCodigoMunicipio
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCodigoMunicipio()
    {
        return this._has_codigoMunicipio;
    } //-- boolean hasCodigoMunicipio() 

    /**
     * Method hasCodigoPessaoJuridica
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCodigoPessaoJuridica()
    {
        return this._has_codigoPessaoJuridica;
    } //-- boolean hasCodigoPessaoJuridica() 

    /**
     * Method hasMesAnoApuracao
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasMesAnoApuracao()
    {
        return this._has_mesAnoApuracao;
    } //-- boolean hasMesAnoApuracao() 

    /**
     * Method hasNroMaxOcorrencias
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasNroMaxOcorrencias()
    {
        return this._has_nroMaxOcorrencias;
    } //-- boolean hasNroMaxOcorrencias() 

    /**
     * Method hasNroSeqUndOrganizacional
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasNroSeqUndOrganizacional()
    {
        return this._has_nroSeqUndOrganizacional;
    } //-- boolean hasNroSeqUndOrganizacional() 

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
     * Sets the value of field 'codigoMunicipio'.
     * 
     * @param codigoMunicipio the value of field 'codigoMunicipio'.
     */
    public void setCodigoMunicipio(long codigoMunicipio)
    {
        this._codigoMunicipio = codigoMunicipio;
        this._has_codigoMunicipio = true;
    } //-- void setCodigoMunicipio(long) 

    /**
     * Sets the value of field 'codigoPessaoJuridica'.
     * 
     * @param codigoPessaoJuridica the value of field
     * 'codigoPessaoJuridica'.
     */
    public void setCodigoPessaoJuridica(long codigoPessaoJuridica)
    {
        this._codigoPessaoJuridica = codigoPessaoJuridica;
        this._has_codigoPessaoJuridica = true;
    } //-- void setCodigoPessaoJuridica(long) 

    /**
     * Sets the value of field 'mesAnoApuracao'.
     * 
     * @param mesAnoApuracao the value of field 'mesAnoApuracao'.
     */
    public void setMesAnoApuracao(int mesAnoApuracao)
    {
        this._mesAnoApuracao = mesAnoApuracao;
        this._has_mesAnoApuracao = true;
    } //-- void setMesAnoApuracao(int) 

    /**
     * Sets the value of field 'nroMaxOcorrencias'.
     * 
     * @param nroMaxOcorrencias the value of field
     * 'nroMaxOcorrencias'.
     */
    public void setNroMaxOcorrencias(int nroMaxOcorrencias)
    {
        this._nroMaxOcorrencias = nroMaxOcorrencias;
        this._has_nroMaxOcorrencias = true;
    } //-- void setNroMaxOcorrencias(int) 

    /**
     * Sets the value of field 'nroSeqUndOrganizacional'.
     * 
     * @param nroSeqUndOrganizacional the value of field
     * 'nroSeqUndOrganizacional'.
     */
    public void setNroSeqUndOrganizacional(int nroSeqUndOrganizacional)
    {
        this._nroSeqUndOrganizacional = nroSeqUndOrganizacional;
        this._has_nroSeqUndOrganizacional = true;
    } //-- void setNroSeqUndOrganizacional(int) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return ListarAliquotaZeradaRequest
     */
    public static br.com.bradesco.web.giss.service.data.pdc.listaraliquotazerada.request.ListarAliquotaZeradaRequest unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.listaraliquotazerada.request.ListarAliquotaZeradaRequest) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.listaraliquotazerada.request.ListarAliquotaZeradaRequest.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.listaraliquotazerada.request.ListarAliquotaZeradaRequest unmarshal(java.io.Reader) 

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
