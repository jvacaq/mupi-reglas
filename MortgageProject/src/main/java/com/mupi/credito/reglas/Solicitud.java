package com.mupi.credito.reglas;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Solicitud implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   @org.kie.api.definition.type.Label("codigoProducto")
   private Integer codigoProducto;

   private java.lang.String grupoTipoCredito;

   private java.lang.String tipoGarantia;

   private java.lang.String tipoCliente;

   private java.lang.Double montoSolicitado;

   private java.lang.String tipoPersona;

   private java.lang.String requiereGarantias;

   private java.lang.String requiereGarantes;

   private java.lang.String resultadoScore;

   private java.lang.String estadoScoreSolicitud;

   private java.lang.Double riesgoTotal;

   private java.lang.String agencia;

   private java.lang.Integer ratificada;

   private java.lang.String consultaDatosSolicitud;

   private java.lang.Integer codigoOficialCuenta;

   private java.lang.String nombreProducto;

   private java.lang.Integer nivelActual;

   private java.lang.Integer ordenComite;

   private java.lang.String ratificadaExt;

   private java.lang.Integer solicitudRatificadaAprobada;

   public Solicitud()
   {
   }

   public java.lang.String getGrupoTipoCredito()
   {
      return this.grupoTipoCredito;
   }

   public void setGrupoTipoCredito(java.lang.String grupoTipoCredito)
   {
      this.grupoTipoCredito = grupoTipoCredito;
   }

   public java.lang.String getTipoGarantia()
   {
      return this.tipoGarantia;
   }

   public void setTipoGarantia(java.lang.String tipoGarantia)
   {
      this.tipoGarantia = tipoGarantia;
   }

   public java.lang.String getTipoCliente()
   {
      return this.tipoCliente;
   }

   public void setTipoCliente(java.lang.String tipoCliente)
   {
      this.tipoCliente = tipoCliente;
   }

   public java.lang.Double getMontoSolicitado()
   {
      return this.montoSolicitado;
   }

   public void setMontoSolicitado(java.lang.Double montoSolicitado)
   {
      this.montoSolicitado = montoSolicitado;
   }

   public java.lang.String getTipoPersona()
   {
      return this.tipoPersona;
   }

   public void setTipoPersona(java.lang.String tipoPersona)
   {
      this.tipoPersona = tipoPersona;
   }

   public java.lang.String getRequiereGarantias()
   {
      return this.requiereGarantias;
   }

   public void setRequiereGarantias(java.lang.String requiereGarantias)
   {
      this.requiereGarantias = requiereGarantias;
   }

   public java.lang.String getRequiereGarantes()
   {
      return this.requiereGarantes;
   }

   public void setRequiereGarantes(java.lang.String requiereGarantes)
   {
      this.requiereGarantes = requiereGarantes;
   }

   public java.lang.Integer getCodigoProducto()
   {
      return this.codigoProducto;
   }

   public void setCodigoProducto(java.lang.Integer codigoProducto)
   {
      this.codigoProducto = codigoProducto;
   }

   public java.lang.String getResultadoScore()
   {
      return this.resultadoScore;
   }

   public void setResultadoScore(java.lang.String resultadoScore)
   {
      this.resultadoScore = resultadoScore;
   }

   public java.lang.String getEstadoScoreSolicitud()
   {
      return this.estadoScoreSolicitud;
   }

   public void setEstadoScoreSolicitud(java.lang.String estadoScoreSolicitud)
   {
      this.estadoScoreSolicitud = estadoScoreSolicitud;
   }

   public java.lang.Double getRiesgoTotal()
   {
      return this.riesgoTotal;
   }

   public void setRiesgoTotal(java.lang.Double riesgoTotal)
   {
      this.riesgoTotal = riesgoTotal;
   }

   public java.lang.String getAgencia()
   {
      return this.agencia;
   }

   public void setAgencia(java.lang.String agencia)
   {
      this.agencia = agencia;
   }

   public java.lang.Integer getRatificada()
   {
      return this.ratificada;
   }

   public void setRatificada(java.lang.Integer ratificada)
   {
      this.ratificada = ratificada;
   }

   public java.lang.String getConsultaDatosSolicitud()
   {
      return this.consultaDatosSolicitud;
   }

   public void setConsultaDatosSolicitud(java.lang.String consultaDatosSolicitud)
   {
      this.consultaDatosSolicitud = consultaDatosSolicitud;
   }

   public java.lang.Integer getCodigoOficialCuenta()
   {
      return this.codigoOficialCuenta;
   }

   public void setCodigoOficialCuenta(java.lang.Integer codigoOficialCuenta)
   {
      this.codigoOficialCuenta = codigoOficialCuenta;
   }

   public java.lang.String getNombreProducto()
   {
      return this.nombreProducto;
   }

   public void setNombreProducto(java.lang.String nombreProducto)
   {
      this.nombreProducto = nombreProducto;
   }

   public java.lang.Integer getNivelActual()
   {
      return this.nivelActual;
   }

   public void setNivelActual(java.lang.Integer nivelActual)
   {
      this.nivelActual = nivelActual;
   }

   public java.lang.Integer getOrdenComite()
   {
      return this.ordenComite;
   }

   public void setOrdenComite(java.lang.Integer ordenComite)
   {
      this.ordenComite = ordenComite;
   }

   public java.lang.String getRatificadaExt()
   {
      return this.ratificadaExt;
   }

   public void setRatificadaExt(java.lang.String ratificadaExt)
   {
      this.ratificadaExt = ratificadaExt;
   }

   public java.lang.Integer getSolicitudRatificadaAprobada()
   {
      return this.solicitudRatificadaAprobada;
   }

   public void setSolicitudRatificadaAprobada(
         java.lang.Integer solicitudRatificadaAprobada)
   {
      this.solicitudRatificadaAprobada = solicitudRatificadaAprobada;
   }

   public Solicitud(java.lang.Integer codigoProducto,
         java.lang.String grupoTipoCredito, java.lang.String tipoGarantia,
         java.lang.String tipoCliente, java.lang.Double montoSolicitado,
         java.lang.String tipoPersona, java.lang.String requiereGarantias,
         java.lang.String requiereGarantes, java.lang.String resultadoScore,
         java.lang.String estadoScoreSolicitud, java.lang.Double riesgoTotal,
         java.lang.String agencia, java.lang.Integer ratificada,
         java.lang.String consultaDatosSolicitud,
         java.lang.Integer codigoOficialCuenta, java.lang.String nombreProducto,
         java.lang.Integer nivelActual, java.lang.Integer ordenComite,
         java.lang.String ratificadaExt,
         java.lang.Integer solicitudRatificadaAprobada)
   {
      this.codigoProducto = codigoProducto;
      this.grupoTipoCredito = grupoTipoCredito;
      this.tipoGarantia = tipoGarantia;
      this.tipoCliente = tipoCliente;
      this.montoSolicitado = montoSolicitado;
      this.tipoPersona = tipoPersona;
      this.requiereGarantias = requiereGarantias;
      this.requiereGarantes = requiereGarantes;
      this.resultadoScore = resultadoScore;
      this.estadoScoreSolicitud = estadoScoreSolicitud;
      this.riesgoTotal = riesgoTotal;
      this.agencia = agencia;
      this.ratificada = ratificada;
      this.consultaDatosSolicitud = consultaDatosSolicitud;
      this.codigoOficialCuenta = codigoOficialCuenta;
      this.nombreProducto = nombreProducto;
      this.nivelActual = nivelActual;
      this.ordenComite = ordenComite;
      this.ratificadaExt = ratificadaExt;
      this.solicitudRatificadaAprobada = solicitudRatificadaAprobada;
   }

}